package biblioteca;

import java.util.Objects;

public class Libro {
	private int cod_libro;
	private String titulo;
	private String isbn;

	//////////////////// CONSTRUCTORES/////////////////////
	/**
	 * CONSTUCTOR COMPLETO
	 * 
	 * @param cod_libro
	 * @param titulo
	 * @param isbn
	 */
	public Libro(int cod_libro, String titulo, String isbn) {
		super();
		this.cod_libro = cod_libro;
		this.titulo = titulo;
		this.isbn = isbn;
	}

	//////////////////// GETTERS AND SETTERS/////////////////////

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

	//////////////////// toString/////////////////////
	@Override
	public String toString() {
		return "Libros [cod_libro=" + cod_libro + ", titulo=" + titulo + ", isbn=" + isbn + "]";
	}

	//////////////////// hashCode and equals/////////////////////

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
		Libro other = (Libro) obj;
		return cod_libro == other.cod_libro && Objects.equals(isbn, other.isbn) && Objects.equals(titulo, other.titulo);
	}

	//////////////////// INICIALIZACIÓN DE DATOS/////////////////////
	public static void main(String[] args) {
		// Crear objetos Libros
		Libro libro1 = new Libro(1, "El señor de los anillos", "1231231231231");
		Libro libro2 = new Libro(2, "El viejo y el mar", "4564564564564");
		Libro libro3 = new Libro(3, "Mi caballo blanco", "7897897897897");
		Libro libro4 = new Libro(4, "Cien años de soledad", "9780143106798");
		Libro libro5 = new Libro(5, "1984", "9780451524935");
		Libro libro6 = new Libro(6, "Crónica de una muerte anunciada", "9781400034710");
		Libro libro7 = new Libro(7, "Norwegian Wood", "9780375704024");
		Libro libro8 = new Libro(8, "Kafka en la orilla", "9781400079278");
		Libro libro9 = new Libro(9, "Rebelión en la granja", "9780451526342");
		Libro libro10 = new Libro(10, "Rayuela", "9788466351988");
		Libro libro11 = new Libro(11, "Don Quijote de la Mancha", "9780060934347");
		Libro libro12 = new Libro(12, "El principito", "9780156012195");
		Libro libro13 = new Libro(13, "El amor en los tiempos del cólera", "9780307389732");

		// Imprimir datos para verificar
		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(libro3);
		System.out.println(libro4);
		System.out.println(libro5);
		System.out.println(libro6);
		System.out.println(libro7);
		System.out.println(libro8);
		System.out.println(libro9);
		System.out.println(libro10);
		System.out.println(libro11);
		System.out.println(libro12);
		System.out.println(libro13);
	}

	//////////////////// MÉTODOS AÑADIDOS ////////////////////
	/**
	 * Valida el formato del ISBN revisando que tiene 13 dígitos.
	 *
	 * @return true si el ISBN tiene un formato válido, false en caso contrario
	 */
	public boolean validarISBN() {
		return isbn.matches("\\d{13}");
	}

}
