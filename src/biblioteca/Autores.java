package biblioteca;

public class Autores {
    private int id_autor;
    private String nombre;
    private String apellidos;
    
    ////////////////////CONSTRUCTORES/////////////////////
	/** CONSTUCTOR COMPLETO
	 * @param id_autor
	 * @param nombre
	 * @param apellidos
	 */
	public Autores(int id_autor, String nombre, String apellidos) {
		super();
		this.id_autor = id_autor;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

////////////////////GETTERS AND SETTERS/////////////////////
	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	////////////////////toString/////////////////////
	@Override
	public String toString() {
		return "Autores [id_autor=" + id_autor + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	
	
}

