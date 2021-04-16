import java.util.Date;
/**
 * @author Sergio Murias
 * @see Autor
 * @version 1.0
 * @since 1.0
 */
public class Autor{

    private String nombre;
    /**
     * nombre del autor
     */
    private String nacionalidad;
    /**
     * nacionalidad del autor
     */
    private Date fechaNacimiento;
    /**
     * fecha de nacimiento del autor
     */
}
/**
 * Constructor vacio
 */
public class Autor{

}
    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param nacionalidad
     * @param fechaNacimiento
     */
    public Autor(String nombre, String nacionalidad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }