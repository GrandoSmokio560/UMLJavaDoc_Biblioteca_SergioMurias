
/**
 * @author Sergio Murias
 * @see Socio
 * @version 1.0
 * @since 1.0
 */
public class Socio {
    private int numero;
    /**
     * numero de identificacion del socio
     */
    private String nombre;
    /**
     * nombre del socio
     */
    private String direccion;
    /**
     * direccion del socio
     */
    private String telefono;
    /**
     * numero de telefono del socio
     */

    /**
     * Constructor vacio
     */
    public Socio() {

    }
    /**
     * Constructor con todos los atributos:
     * @param numero
     * @param nombre
     * @param direccion
     * @param telefono
     */
    public Socio(int numero, String nombre, String direccion, String telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
