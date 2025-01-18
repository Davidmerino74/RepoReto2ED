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

	////////////////////INICIALIZACIÓN DE DATOS/////////////////////
	public static void main(String[] args) {
	// Crear objetos LibroAutor
	LibroAutor libroAutor1 = new LibroAutor(1, 1);
	LibroAutor libroAutor2 = new LibroAutor(2, 2);
	LibroAutor libroAutor3 = new LibroAutor(3, 3);
	LibroAutor libroAutor4 = new LibroAutor(4, 5);
	LibroAutor libroAutor5 = new LibroAutor(5, 7);
	LibroAutor libroAutor6 = new LibroAutor(6, 5);
	LibroAutor libroAutor7 = new LibroAutor(7, 6);
	LibroAutor libroAutor8 = new LibroAutor(8, 6);
	LibroAutor libroAutor9 = new LibroAutor(9, 7);
	LibroAutor libroAutor10 = new LibroAutor(10, 8);
	LibroAutor libroAutor11 = new LibroAutor(11, 10);
	LibroAutor libroAutor12 = new LibroAutor(12, 9);
	LibroAutor libroAutor13 = new LibroAutor(13, 5);
	
	// Imprimir datos para verificar
	System.out.println(libroAutor1);
	System.out.println(libroAutor2);
	System.out.println(libroAutor3);
	System.out.println(libroAutor4);
	System.out.println(libroAutor5);
	System.out.println(libroAutor6);
	System.out.println(libroAutor7);
	System.out.println(libroAutor8);
	System.out.println(libroAutor9);
	System.out.println(libroAutor10);
	System.out.println(libroAutor11);
	System.out.println(libroAutor12);
	System.out.println(libroAutor13);
	}

	
}

