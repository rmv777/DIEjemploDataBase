package itep.diejemplodatabase.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoPersonaImpl implements DaoPersona {

    public Connection conectar() {
        Connection myCon = null;
        String url = "jdbc:mysql://localhost:3306/mensajeria?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "root";
        try {
            myCon = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return myCon;
    }

    @Override
    public boolean guardarPersona(Persona p) {
        try {
            Connection myCon = conectar();
            //String consulta2 = "INSERT INTO persona (dni, nombre, apellido1, apellido2, domicilio, genero, aficion) "
            //        + "VALUES ('03674765R', 'Fernando', 'Sanchez', 'Romero', 'Mayor 2', 'Hombre', 'Naturaleza')";
            String consulta = "insert into persona (dni, nombre, apellido1, apellido2, domicilio, genero, aficion) values(?,?,?,?,?,?,?)";
            PreparedStatement sentencia = myCon.prepareStatement(consulta);
            sentencia.setString(1, p.getDni());
            sentencia.setString(2, p.getNombre());
            sentencia.setString(3, p.getApellido1());
            sentencia.setString(4, p.getApellido2());
            sentencia.setString(5, p.getDomicilio());
            sentencia.setString(6, p.getGenero());
            sentencia.setString(7, p.getAficion());
            sentencia.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ResultSet resulsetGet(){
        //ArrayList<Persona> listadoPersonas = new ArrayList();
        Persona persona=null;
        try {
            Connection myCon = conectar();
            // Creamos un Statement que trabaje con resultset recorrible y actualizable
            Statement sentencia = 
                myCon.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE); //con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "select * from persona";
            ResultSet resultado = sentencia.executeQuery(sql);
            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    @Override
    public boolean eliminarPersona(Persona p) {
        try {
            int fila=0;
            Connection myCon = conectar();
            String consulta = "Select dni from persona where dni='" + p.getDni() +"'";
            Statement st = myCon.createStatement();
            ResultSet resultado = st.executeQuery(consulta);
            if (resultado.next()){            
                    consulta = "delete from persona where dni ='"+ p.getDni() +"'";
                    fila = st.executeUpdate(consulta);
            }
            if (fila==1) return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean modificarPersona(Persona p) {
        try {
            Connection myCon = conectar();
            String consulta = "UPDATE persona SET dni = ?, nombre = ?, apellido1=?, apellido2=?, domicilio=?,genero=?,aficion=?  WHERE dni = ?";
            PreparedStatement sentencia = myCon.prepareStatement(consulta);
            sentencia.setString(1, p.getDni());
            sentencia.setString(2, p.getNombre());
            sentencia.setString(3, p.getApellido1());
            sentencia.setString(4, p.getApellido2());
            sentencia.setString(5, p.getDomicilio());
            sentencia.setString(6, p.getGenero());
            sentencia.setString(7, p.getAficion());
            sentencia.setString(8, p.getDni());
            sentencia.executeUpdate();
            System.out.println("Persona actualizada" + p.toString());
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public Persona leerPersona(String dni) {
        Persona persona = null;
        try {
            Connection myCon = conectar();
            Statement sentencia = myCon.createStatement();
            String sql = "select * from persona where dni = '" + dni + "'";
            ResultSet resultado = sentencia.executeQuery(sql);
            boolean hayFila = resultado.next();
            if (hayFila) {
                persona = new Persona();
                persona.setDni(resultado.getString("dni"));
                persona.setNombre(resultado.getString("nombre"));
                persona.setApellido1(resultado.getString("apellido1"));
                persona.setApellido2(resultado.getString("apellido2"));
                persona.setDomicilio(resultado.getString("domicilio"));
                persona.setGenero(resultado.getString("genero"));
                persona.setAficion(resultado.getString("aficion"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persona;
    }

    @Override
    public ArrayList leerPersonas() {
        ArrayList<Persona> listadoPersonas = new ArrayList();
        Persona persona=null;
        try {
            Connection myCon = conectar();
            Statement sentencia = myCon.createStatement();
            String sql = "select * from persona";
            ResultSet resultado = sentencia.executeQuery(sql);
            while(resultado.next()) {
                persona = new Persona();
                persona.setDni(resultado.getString("dni"));
                persona.setNombre(resultado.getString("nombre"));
                persona.setApellido1(resultado.getString("apellido1"));
                persona.setApellido2(resultado.getString("apellido2"));
                persona.setDomicilio(resultado.getString("domicilio"));
                persona.setGenero(resultado.getString("genero"));
                persona.setAficion(resultado.getString("aficion"));
                listadoPersonas.add(persona);
            }           

        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonaImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listadoPersonas;
    }
}
