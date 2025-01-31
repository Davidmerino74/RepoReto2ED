package biblioteca;

import java.util.Objects;

public abstract class Autor {
	private int id_autor;
	private String nombre;
	private String apellidos;

	//////////////////// CONSTRUCTORES ///////////////////////
	/**
	 * CONSTUCTOR COMPLETO
	 * 
	 * @param id_autor
	 * @param nombre
	 * @param apellidos
	 */
	public Autor(int id_autor, String nombre, String apellidos) {
		this.id_autor = id_autor;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	//////////////////// GETTERS AND SETTERS ///////////////////////
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

	//////////////////// MÉTODO ABSTRACTO ///////////////////////
	public abstract String obtenerTipoAutor();

	//////////////////// toString ///////////////////////
	@Override
	public String toString() {
		return "Autores [id_autor=" + id_autor + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	//////////////////// hashCode y equals ///////////////////////
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, id_autor, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return id_autor == other.id_autor && Objects.equals(nombre, other.nombre)
				&& Objects.equals(apellidos, other.apellidos);
	}

	//////////////////// MÉTODOS AÑADIDOS ///////////////////////
	/**
	 * Obtiene el nombre completo del autor.
	 *
	 * @return una cadena de texto con el nombre completo del autor
	 */
	public String obtenerNombreCompleto() {
		return nombre + " " + apellidos;
	}

	/**
	 * Verifica si el nombre o los apellidos del autor contienen una palabra
	 * específica.
	 *
	 * @param palabra la palabra a buscar
	 * @return true si la palabra está contenida en el nombre completo, false en
	 *         caso contrario
	 */
	public boolean contienePalabra(String palabra) {
		return obtenerNombreCompleto().toLowerCase().contains(palabra.toLowerCase());
	}
}



