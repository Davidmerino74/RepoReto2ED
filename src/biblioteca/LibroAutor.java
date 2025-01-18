package biblioteca;

import java.util.Objects;

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

	////////////////////toString/////////////////////

	@Override
	public String toString() {
		return "LibroAutor [cod_libro=" + cod_libro + ", id_autor=" + id_autor + "]";
	}

	////////////////////hashCode and equals/////////////////////
	@Override
	public int hashCode() {
		return Objects.hash(cod_libro, id_autor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibroAutor other = (LibroAutor) obj;
		return cod_libro == other.cod_libro && id_autor == other.id_autor;
	}

	
	
}

