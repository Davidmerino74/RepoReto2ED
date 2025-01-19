package biblioteca;

import java.util.Objects;

public class Ejemplares {
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
	public Ejemplares(int id_ejemplar, int cod_libro, String isbn, String estado, String disponibilidad) {
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
		Ejemplares other = (Ejemplares) obj;
		return cod_libro == other.cod_libro && id_ejemplar == other.id_ejemplar && Objects.equals(isbn, other.isbn);
	}

	//////////////////// INICIALIZACIÓN DE DATOS/////////////////////
	public static void main(String[] args) {
		// Crear objetos Ejemplares
		Ejemplares ejemplar1 = new Ejemplares(12345, 1, "1234567891234", "bueno", "si");
		Ejemplares ejemplar2 = new Ejemplares(23456, 2, "2345678912345", "malo", "si");
		Ejemplares ejemplar3 = new Ejemplares(34567, 3, "4567891234567", "bueno", "si");
		Ejemplares ejemplar4 = new Ejemplares(45678, 4, "9780143106798", "bueno", "si");
		Ejemplares ejemplar5 = new Ejemplares(56789, 5, "9780451524935", "malo", "no");
		Ejemplares ejemplar6 = new Ejemplares(67890, 6, "9781400034710", "bueno", "si");
		Ejemplares ejemplar7 = new Ejemplares(78901, 7, "9780375704024", "bueno", "no");
		Ejemplares ejemplar8 = new Ejemplares(89012, 8, "9781400079278", "malo", "si");
		Ejemplares ejemplar9 = new Ejemplares(90123, 9, "9780451526342", "bueno", "si");
		Ejemplares ejemplar10 = new Ejemplares(12346, 10, "9788466351988", "bueno", "no");
		Ejemplares ejemplar11 = new Ejemplares(23457, 11, "9780060934347", "bueno", "si");
		Ejemplares ejemplar12 = new Ejemplares(34568, 12, "9780156012195", "malo", "si");
		Ejemplares ejemplar13 = new Ejemplares(45679, 13, "9780307389732", "bueno", "si");

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
