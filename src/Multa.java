import java.util.Date;

/**
 * @author Sergio Murias
 * @see Multa
 * @see Socio
 * @version 1.0
 * @since 1.0
 */
public class Multa extends Socio {

    private Date inicio;
    /**
     * fecha de inicio
     */
    private Date fin;

    /**
     * fecha de finalización
     */

    /**
     * Constructor vacio
     */
    public Multa(){
    }
    /**
     * Constructor con todos los atributos:
     * @param numero
     * @param nombre
     * @param direccion
     * @param telefono
     * @param inicio
     * @param fin
     */
    public Multa(int numero, String nombre, String direccion, String telefono) {
        super(numero, nombre, direccion, telefono);
        this.inicio = inicio;
        this.fin = fin;
    }

    public Multa(Date inicio, Date fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
}
