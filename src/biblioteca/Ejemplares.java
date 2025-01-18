package biblioteca;

public class Ejemplares {
    private int id_ejemplar;
    private int cod_libro;
    private String isbn;
    private String estado;
    private String disponibilidad;
    
    ////////////////////CONSTRUCTORES/////////////////////
	/** CONSTUCTOR COMPLETO
	 * @param id_ejemplar
	 * @param cod_libro
	 * @param isbn
	 * @param estado
	 * @param disponibilidad
	 */
	public Ejemplares(int id_ejemplar, int cod_libro, String isbn, String estado, String disponibilidad) {
		super();
		this.id_ejemplar = id_ejemplar;
		this.cod_libro = cod_libro;
		this.isbn = isbn;
		this.estado = estado;
		this.disponibilidad = disponibilidad;
	}

    
}

