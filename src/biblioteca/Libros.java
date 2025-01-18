package biblioteca;

public class Libros {
	private int cod_libro;
	private String titulo;
	private String isbn;
	
    ////////////////////CONSTRUCTORES/////////////////////
	/** CONSTUCTOR COMPLETO
	 * @param cod_libro
	 * @param titulo
	 * @param isbn
	 */
	public Libros(int cod_libro, String titulo, String isbn) {
		super();
		this.cod_libro = cod_libro;
		this.titulo = titulo;
		this.isbn = isbn;
	}	

	
}
