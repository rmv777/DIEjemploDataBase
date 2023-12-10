
package itep.diejemplodatabase.dao;


public class Persona {
    
    private String dni, nombre, apellido1, apellido2, domicilio,genero,aficion;

    public Persona(){
    }
    
    public Persona(String dni, String nombre, String apellido1, String apellido2, String domicilio, String genero, String aficion) {
        this.dni =dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.domicilio = domicilio;
        this.genero = genero;
        this.aficion = aficion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAficion() {
        return aficion;
    }

    public void setAficion(String aficion) {
        this.aficion = aficion;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", domicilio=" + domicilio + ", genero=" + genero + ", aficion=" + aficion + '}';
    }
    
}
