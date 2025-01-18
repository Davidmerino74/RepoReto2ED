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

	////////////////////INICIALIZACIÓN DE DATOS/////////////////////
	public static void main(String[] args) {
	// Crear objetos Autores
	Autores autor1 = new Autores(1, "Gabriel", "Garcia Marquez");
	Autores autor2 = new Autores(2, "Hariky", "Murakay Murakami");
	Autores autor3 = new Autores(3, "George", "Orwell");
	Autores autor4 = new Autores(4, "Ernest", "Hemingway");
	Autores autor5 = new Autores(5, "Gabriel", "García Márquez");
	Autores autor6 = new Autores(6, "Haruki", "Murakami");
	Autores autor7 = new Autores(7, "George", "Orwell");
	Autores autor8 = new Autores(8, "Julio", "Cortázar");
	Autores autor9 = new Autores(9, "Antoine", "de Saint-Exupéry");
	Autores autor10 = new Autores(10, "Miguel", "de Cervantes");
	Autores autor11 = new Autores(11, "Hermann", "Hesse");
	Autores autor12 = new Autores(12, "J.K.", "Rowling");
	Autores autor13 = new Autores(13, "F. Scott", "Fitzgerald");
	
	// Imprimir datos para verificar
	System.out.println(autor1);
	System.out.println(autor2);
	System.out.println(autor3);
	System.out.println(autor4);
	System.out.println(autor5);
	System.out.println(autor6);
	System.out.println(autor7);
	System.out.println(autor8);
	System.out.println(autor9);
	System.out.println(autor10);
	System.out.println(autor11);
	System.out.println(autor12);
	System.out.println(autor13);
	}


	
}

