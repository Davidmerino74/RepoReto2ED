package biblioteca;

import java.util.Objects;

public class Ejemplar {
	private int id_ejemplar;
	private int cod_libro;
	private String isbn;
	private String estado;
	private String disponibilidad;

	//////////////////// CONSTRUCTORES/////////////////////
	/**
	 * CONSTUCTOR COMPLETO
	 * 
	 * @param id_ejemplar
	 * @param cod_libro
	 * @param isbn
	 * @param estado
	 * @param disponibilidad
	 */
	public Ejemplar(int id_ejemplar, int cod_libro, String isbn, String estado, String disponibilidad) {
		super();
		this.id_ejemplar = id_ejemplar;
		this.cod_libro = cod_libro;
		this.isbn = isbn;
		this.estado = estado;
		this.disponibilidad = disponibilidad;
	}
	//////////////////// GETTERS AND SETTERS/////////////////////

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

	//////////////////// toString/////////////////////
	@Override
	public String toString() {
		return "Ejemplares [id_ejemplar=" + id_ejemplar + ", cod_libro=" + cod_libro + ", isbn=" + isbn + ", estado="
				+ estado + ", disponibilidad=" + disponibilidad + "]";
	}

	//////////////////// hashCode and equals/////////////////////
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
		Ejemplar other = (Ejemplar) obj;
		return cod_libro == other.cod_libro && id_ejemplar == other.id_ejemplar && Objects.equals(isbn, other.isbn);
	}

	//////////////////// INICIALIZACIÓN DE DATOS/////////////////////
	public static void main(String[] args) {
		// Crear objetos Ejemplares
		Ejemplar ejemplar1 = new Ejemplar(12345, 1, "1234567891234", "bueno", "si");
		Ejemplar ejemplar2 = new Ejemplar(23456, 2, "2345678912345", "malo", "si");
		Ejemplar ejemplar3 = new Ejemplar(34567, 3, "4567891234567", "bueno", "si");
		Ejemplar ejemplar4 = new Ejemplar(45678, 4, "9780143106798", "bueno", "si");
		Ejemplar ejemplar5 = new Ejemplar(56789, 5, "9780451524935", "malo", "no");
		Ejemplar ejemplar6 = new Ejemplar(67890, 6, "9781400034710", "bueno", "si");
		Ejemplar ejemplar7 = new Ejemplar(78901, 7, "9780375704024", "bueno", "no");
		Ejemplar ejemplar8 = new Ejemplar(89012, 8, "9781400079278", "malo", "si");
		Ejemplar ejemplar9 = new Ejemplar(90123, 9, "9780451526342", "bueno", "si");
		Ejemplar ejemplar10 = new Ejemplar(12346, 10, "9788466351988", "bueno", "no");
		Ejemplar ejemplar11 = new Ejemplar(23457, 11, "9780060934347", "bueno", "si");
		Ejemplar ejemplar12 = new Ejemplar(34568, 12, "9780156012195", "malo", "si");
		Ejemplar ejemplar13 = new Ejemplar(45679, 13, "9780307389732", "bueno", "si");

		// Imprimir datos para verificar
		System.out.println(ejemplar1);
		System.out.println(ejemplar2);
		System.out.println(ejemplar3);
		System.out.println(ejemplar4);
		System.out.println(ejemplar5);
		System.out.println(ejemplar6);
		System.out.println(ejemplar7);
		System.out.println(ejemplar8);
		System.out.println(ejemplar9);
		System.out.println(ejemplar10);
		System.out.println(ejemplar11);
		System.out.println(ejemplar12);
		System.out.println(ejemplar13);
	}

	//////////////////// MÉTODOS AÑADIDOS ////////////////////

	/**
	 * Comprueba si el ejemplar está disponible y en buen estado.
	 *
	 * @return true si el ejemplar está disponible y en buen estado, false en caso
	 *         contrario.
	 */
	public boolean esEjemplarDisponibleYBueno() {
		return this.disponibilidad.equals("si") && this.estado.equals("bueno");
	}

}
