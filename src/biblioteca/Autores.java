package biblioteca;

import java.util.Objects;

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

	////////////////////hashCode and equals/////////////////////
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, id_autor, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autores other = (Autores) obj;
		return Objects.equals(apellidos, other.apellidos) && id_autor == other.id_autor
				&& Objects.equals(nombre, other.nombre);
	}

	
	
}

