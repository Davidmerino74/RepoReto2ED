package biblioteca;

import java.util.Objects;

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
	////////////////////GETTERS AND SETTERS/////////////////////

	public int getId_ejemplar() {
		return id_ejemplar;
	}

	public void setId_ejemplar(int id_ejemplar) {
		this.id_ejemplar = id_ejemplar;
	}

	public int getCod_libro() {
		return cod_libro;
	}

	public void setCod_libro(int cod_libro) {
		this.cod_libro = cod_libro;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	////////////////////toString/////////////////////
	@Override
	public String toString() {
		return "Ejemplares [id_ejemplar=" + id_ejemplar + ", cod_libro=" + cod_libro + ", isbn=" + isbn + ", estado="
				+ estado + ", disponibilidad=" + disponibilidad + "]";
	}
	////////////////////hashCode and equals/////////////////////
	@Override
	public int hashCode() {
		return Objects.hash(cod_libro, id_ejemplar, isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejemplares other = (Ejemplares) obj;
		return cod_libro == other.cod_libro && id_ejemplar == other.id_ejemplar && Objects.equals(isbn, other.isbn);
	}
	

	
	
	
}

