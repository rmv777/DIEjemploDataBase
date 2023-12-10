package itep.diejemplodatabase.dao;

import java.util.ArrayList;

public interface DaoPersona {
    
    public boolean guardarPersona(Persona p);
    public boolean eliminarPersona(Persona p);
    public boolean modificarPersona(Persona p);
    public Persona leerPersona(String dni);
    public ArrayList leerPersonas();
    
}
