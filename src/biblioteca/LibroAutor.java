package biblioteca;

public class LibroAutor {
    private int cod_libro;
    private int id_autor;
    
    ////////////////////CONSTRUCTORES/////////////////////
	/** CONSTUCTOR COMPLETO	
	 * @param cod_libro
	 * @param id_autor
	 */
	public LibroAutor(int cod_libro, int id_autor) {
		super();
		this.cod_libro = cod_libro;
		this.id_autor = id_autor;
	}
	
	
	////////////////////GETTERS AND SETTERS/////////////////////

	public int getCod_libro() {
		return cod_libro;
	}

	public void setCod_libro(int cod_libro) {
		this.cod_libro = cod_libro;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	
	
}

