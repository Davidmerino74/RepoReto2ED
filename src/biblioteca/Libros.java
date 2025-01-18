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
	
	////////////////////GETTERS AND SETTERS/////////////////////

	public int getCod_libro() {
		return cod_libro;
	}

	public void setCod_libro(int cod_libro) {
		this.cod_libro = cod_libro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}	

	
	
}
