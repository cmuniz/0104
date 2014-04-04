
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
    }

    public String generateStarWarsName(String tuNombre, String tuApellido, String mamaNombre, String ciudadNacimiento){
    String nombreStarWars;
    String apellidoStarWars;
    if(tuNombre.length() > 3){
        nombreStarWars = tuNombre.substring(0,3);
    }
    else {
        nombreStarWars = tuNombre;
    }
        if(tuApellido.length() > 3){
        nombreStarWars += tuApellido.substring(0,3);
    }
    else {
        nombreStarWars += tuApellido;
    }

        if(mamaNombre.length() > 3){
        apellidoStarWars = mamaNombre.substring(0,3);
    }
    else {
        apellidoStarWars = mamaNombre;
    }
        if(ciudadNacimiento.length() > 3){
        apellidoStarWars += ciudadNacimiento.substring(0,3);
    }
    else {
        apellidoStarWars += ciudadNacimiento;
    }
    
    return nombreStarWars + " " + apellidoStarWars;
    }
}
