package biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * 
 */
public class Prestamo {
	private int id_prestamo;
	private int id_ejemplar;
	private String dni;
	private int n_max_prestado;
	private LocalDate fecha_prestamo;
	private LocalDate fecha_limite_devolucion;
	private LocalDate fecha_efectiva_devolucion;

	//////////////////// CONSTRUCTORES/////////////////////
	/**
	 * CONSTUCTOR COMPLETO
	 * 
	 * @param id_prestamo
	 * @param id_ejemplar
	 * @param dni
	 * @param n_max_prestado
	 * @param fecha_prestamo
	 * @param fecha_limite_devolucion
	 * @param fecha_efectiva_devolucion
	 */
	public Prestamo(int id_prestamo, int id_ejemplar, String dni, int n_max_prestado, LocalDate fecha_prestamo,
			LocalDate fecha_limite_devolucion, LocalDate fecha_efectiva_devolucion) {
		super();
		this.id_prestamo = id_prestamo;
		this.id_ejemplar = id_ejemplar;
		this.dni = dni;
		this.n_max_prestado = n_max_prestado;
		this.fecha_prestamo = fecha_prestamo;
		this.fecha_limite_devolucion = fecha_limite_devolucion;
		this.fecha_efectiva_devolucion = fecha_efectiva_devolucion;
	}

	/**
	 * CONSTUCTOR SIN FECHA_EFECTIVA_DEVOLUCION
	 * 
	 * @param id_prestamo
	 * @param id_ejemplar
	 * @param dni
	 * @param n_max_prestado
	 * @param fecha_prestamo
	 * @param fecha_limite_devolucion
	 */
	public Prestamo(int id_prestamo, int id_ejemplar, String dni, int n_max_prestado, LocalDate fecha_prestamo,
			LocalDate fecha_limite_devolucion) {
		super();
		this.id_prestamo = id_prestamo;
		this.id_ejemplar = id_ejemplar;
		this.dni = dni;
		this.n_max_prestado = n_max_prestado;
		this.fecha_prestamo = fecha_prestamo;
		this.fecha_limite_devolucion = fecha_limite_devolucion;
	}

	//////////////////// GETTERS AND SETTERS/////////////////////

	public int getId_prestamo() {
		return id_prestamo;
	}

	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}

	public int getId_ejemplar() {
		return id_ejemplar;
	}

	public void setId_ejemplar(int id_ejemplar) {
		this.id_ejemplar = id_ejemplar;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getN_max_prestado() {
		return n_max_prestado;
	}

	public void setN_max_prestado(int n_max_prestado) {
		this.n_max_prestado = n_max_prestado;
	}

	public LocalDate getFecha_prestamo() {
		return fecha_prestamo;
	}

	public void setFecha_prestamo(LocalDate fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}

	public LocalDate getFecha_limite_devolucion() {
		return fecha_limite_devolucion;
	}

	public void setFecha_limite_devolucion(LocalDate fecha_limite_devolucion) {
		this.fecha_limite_devolucion = fecha_limite_devolucion;
	}

	public LocalDate getFecha_efectiva_devolucion() {
		return fecha_efectiva_devolucion;
	}

	public void setFecha_efectiva_devolucion(LocalDate fecha_efectiva_devolucion) {
		this.fecha_efectiva_devolucion = fecha_efectiva_devolucion;
	}

	//////////////////// toString/////////////////////
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Prestamos [id_prestamo=" + id_prestamo + ", id_ejemplar=" + id_ejemplar + ", dni=" + dni
				+ ", n_max_prestado=" + n_max_prestado + ", fecha_prestamo=" + fecha_prestamo.format(formatter)
				+ ", fecha_limite_devolucion=" + fecha_limite_devolucion.format(formatter)
				+ ", fecha_efectiva_devolucion="
				+ (fecha_efectiva_devolucion != null ? fecha_efectiva_devolucion.format(formatter) : "null") + "]";
	}

	//////////////////// hashCode and equals/////////////////////
	@Override
	public int hashCode() {
		return Objects.hash(dni, id_prestamo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return Objects.equals(dni, other.dni) && id_prestamo == other.id_prestamo;
	}

	//////////////////// INICIALIZACIÓN DE DATOS/////////////////////
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Crear objetos Prestamos
		Prestamo prestamo1 = new Prestamo(10101, 12345, "10123456Q", 1, LocalDate.parse("10/10/2024", formatter),
				LocalDate.parse("25/10/2024", formatter), LocalDate.parse("24/10/2024", formatter));
		Prestamo prestamo2 = new Prestamo(10102, 23456, "20456789I", 3, LocalDate.parse("12/10/2024", formatter),
				LocalDate.parse("27/10/2024", formatter), LocalDate.parse("30/10/2024", formatter));
		Prestamo prestamo3 = new Prestamo(10103, 34567, "30789789P", 2, LocalDate.parse("14/10/2024", formatter),
				LocalDate.parse("29/10/2024", formatter), LocalDate.parse("30/10/2024", formatter));
		Prestamo prestamo4 = new Prestamo(10104, 45678, "40896789T", 2, LocalDate.parse("10/11/2024", formatter),
				LocalDate.parse("25/11/2024", formatter), LocalDate.parse("24/11/2024", formatter));
		Prestamo prestamo5 = new Prestamo(10105, 56789, "50985647R", 1, LocalDate.parse("11/11/2024", formatter),
				LocalDate.parse("26/11/2024", formatter), null);
		Prestamo prestamo6 = new Prestamo(10106, 67890, "61234578Q", 3, LocalDate.parse("12/11/2024", formatter),
				LocalDate.parse("27/11/2024", formatter), LocalDate.parse("28/11/2024", formatter));
		Prestamo prestamo7 = new Prestamo(10107, 78901, "70956345W", 2, LocalDate.parse("13/11/2024", formatter),
				LocalDate.parse("28/11/2024", formatter), LocalDate.parse("29/11/2024", formatter));
		Prestamo prestamo8 = new Prestamo(10108, 89012, "80123457E", 3, LocalDate.parse("14/11/2024", formatter),
				LocalDate.parse("29/11/2024", formatter), null);
		Prestamo prestamo9 = new Prestamo(10109, 90123, "90765438Y", 1, LocalDate.parse("15/11/2024", formatter),
				LocalDate.parse("30/11/2024", formatter), LocalDate.parse("01/12/2024", formatter));
		Prestamo prestamo10 = new Prestamo(10110, 12346, "10234567U", 2, LocalDate.parse("16/11/2024", formatter),
				LocalDate.parse("01/12/2024", formatter), null);
		Prestamo prestamo11 = new Prestamo(10111, 23457, "20346789I", 3, LocalDate.parse("17/11/2024", formatter),
				LocalDate.parse("02/12/2024", formatter), LocalDate.parse("03/12/2024", formatter));
		Prestamo prestamo12 = new Prestamo(10112, 34568, "30457890P", 1, LocalDate.parse("18/11/2024", formatter),
				LocalDate.parse("03/12/2024", formatter), LocalDate.parse("04/12/2024", formatter));
		Prestamo prestamo13 = new Prestamo(10113, 45679, "40568912K", 2, LocalDate.parse("19/11/2024", formatter),
				LocalDate.parse("04/12/2024", formatter), null);

		// Imprimir datos para verificar
		System.out.println(prestamo1);
		System.out.println(prestamo2);
		System.out.println(prestamo3);
		System.out.println(prestamo4);
		System.out.println(prestamo5);
		System.out.println(prestamo6);
		System.out.println(prestamo7);
		System.out.println(prestamo8);
		System.out.println(prestamo9);
		System.out.println(prestamo10);
		System.out.println(prestamo11);
		System.out.println(prestamo12);
		System.out.println(prestamo13);

	}

	//////////////////// MÉTODOS AÑADIDOS ////////////////////
	/**
	 * Verifica si el préstamo está vencido.
	 *
	 * @return true si el préstamo está vencido, false en caso contrario
	 */
	public boolean estaPrestamoVencido() {
		return LocalDate.now().isAfter(fecha_limite_devolucion) && fecha_efectiva_devolucion == null;
	}

}
