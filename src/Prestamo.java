import java.util.Date;
/**
 * @author Sergio Murias
 * @see Prestamo
 * @see Socio
 * @version 1.0
 * @since 1.0
 */
public class Prestamo extends Socio {
    /**
     * fecha de inicio
     */
    private Date inicio;
    /**
     * fecha de finalizacion
     */
    private Date fin;

    public Prestamo(Date inicio, Date fin) {
        this.inicio = inicio;
        this.fin = fin;
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
    public Prestamo(int numero, String nombre, String direccion, String telefono, Date inicio, Date fin) {
        super(numero, nombre, direccion, telefono);
        this.inicio = inicio;
        this.fin = fin;
    }
}
