package biblioteca;

import java.util.Objects;

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
	////////////////////toString/////////////////////
	@Override
	public String toString() {
		return "Libros [cod_libro=" + cod_libro + ", titulo=" + titulo + ", isbn=" + isbn + "]";
	}
	
	////////////////////hashCode and equals/////////////////////

	@Override
	public int hashCode() {
		return Objects.hash(cod_libro, isbn, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libros other = (Libros) obj;
		return cod_libro == other.cod_libro && Objects.equals(isbn, other.isbn) && Objects.equals(titulo, other.titulo);
	}	

	
	
}
