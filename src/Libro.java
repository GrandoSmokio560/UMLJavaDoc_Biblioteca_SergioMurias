/**
 * @author Sergio Murias
 * @see Libro
 * @version 1.0
 * @since 1.0
 */
public  class Libro {
    private String titulo;
    /**
     * titulo del libro
     */
    private String editorial;
    /**
     * editorial del libro
     */
    private String year;
    /**
     * año de escritura del libro
     */
    private enum tipo;
    /**
     * tipo del libro
     */

    /**
     * Constructor vacio
     */
    public Libro(){

    }
    /**
     * Constructor con todos los atributos:
     * @param titulo
     * @param editorial
     * @param year
     */
    public Libro(String titulo, String editorial, String year) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.year = year;
    }
}