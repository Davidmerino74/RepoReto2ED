package biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Penalizacion {
	private int id_penalizacion;
	private int id_prestamo;
	private int dias_penalizacion;
	private LocalDate fecha_inicio_penalizacion;

	//////////////////// CONSTRUCTORES/////////////////////
	/**
	 * CONSTUCTOR COMPLETO
	 * 
	 * @param id_penalizacion
	 * @param id_prestamo
	 * @param dias_penalizacion
	 * @param fecha_inicio_penalizacion
	 */
	public Penalizacion(int id_penalizacion, int id_prestamo, int dias_penalizacion,
			LocalDate fecha_inicio_penalizacion) {
		super();
		this.id_penalizacion = id_penalizacion;
		this.id_prestamo = id_prestamo;
		this.dias_penalizacion = dias_penalizacion;
		this.fecha_inicio_penalizacion = fecha_inicio_penalizacion;
	}
	//////////////////// GETTERS AND SETTERS/////////////////////

	public int getId_penalizacion() {
		return id_penalizacion;
	}

	public void setId_penalizacion(int id_penalizacion) {
		this.id_penalizacion = id_penalizacion;
	}

	public int getId_prestamo() {
		return id_prestamo;
	}

	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}

	public int getDias_penalizacion() {
		return dias_penalizacion;
	}

	public void setDias_penalizacion(int dias_penalizacion) {
		this.dias_penalizacion = dias_penalizacion;
	}

	public LocalDate getFecha_inicio_penalizacion() {
		return fecha_inicio_penalizacion;
	}

	public void setFecha_inicio_penalizacion(LocalDate fecha_inicio_penalizacion) {
		this.fecha_inicio_penalizacion = fecha_inicio_penalizacion;
	}

	//////////////////// toString/////////////////////
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Penalizaciones [id_penalizacion=" + id_penalizacion + ", id_prestamo=" + id_prestamo
				+ ", dias_penalizacion=" + dias_penalizacion + ", fecha_inicio_penalizacion="
				+ fecha_inicio_penalizacion.format(formatter) + "]";
	}

	//////////////////// hashCode and equals/////////////////////
	@Override
	public int hashCode() {
		return Objects.hash(id_penalizacion, id_prestamo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Penalizacion other = (Penalizacion) obj;
		return id_penalizacion == other.id_penalizacion && id_prestamo == other.id_prestamo;
	}

	//////////////////// INICIALIZACIÓN DE DATOS/////////////////////
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// Crear objetos Penalizaciones
		Penalizacion penalizacion1 = new Penalizacion(11111, 10102, 15, LocalDate.parse("30/10/2024", formatter));
		Penalizacion penalizacion2 = new Penalizacion(11112, 10103, 15, LocalDate.parse("30/10/2024", formatter));
		Penalizacion penalizacion3 = new Penalizacion(11113, 10105, 10, LocalDate.parse("05/12/2024", formatter));
		Penalizacion penalizacion4 = new Penalizacion(11114, 10108, 15, LocalDate.parse("05/12/2024", formatter));
		Penalizacion penalizacion5 = new Penalizacion(11115, 10110, 20, LocalDate.parse("05/12/2024", formatter));
		Penalizacion penalizacion6 = new Penalizacion(11116, 10112, 25, LocalDate.parse("06/12/2024", formatter));
		Penalizacion penalizacion7 = new Penalizacion(11117, 10113, 15, LocalDate.parse("07/12/2024", formatter));
		Penalizacion penalizacion8 = new Penalizacion(11118, 10104, 5, LocalDate.parse("08/12/2024", formatter));
		Penalizacion penalizacion9 = new Penalizacion(11119, 10109, 10, LocalDate.parse("09/12/2024", formatter));
		Penalizacion penalizacion10 = new Penalizacion(11120, 10107, 30, LocalDate.parse("10/12/2024", formatter));
		Penalizacion penalizacion11 = new Penalizacion(11121, 10106, 15, LocalDate.parse("11/12/2024", formatter));
		Penalizacion penalizacion12 = new Penalizacion(11122, 10111, 10, LocalDate.parse("12/12/2024", formatter));

		// Imprimir datos para verificar
		System.out.println(penalizacion1);
		System.out.println(penalizacion2);
		System.out.println(penalizacion3);
		System.out.println(penalizacion4);
		System.out.println(penalizacion5);
		System.out.println(penalizacion6);
		System.out.println(penalizacion7);
		System.out.println(penalizacion8);
		System.out.println(penalizacion9);
		System.out.println(penalizacion10);
		System.out.println(penalizacion11);
		System.out.println(penalizacion12);
	}

	//////////////////// MÉTODOS AÑADIDOS ////////////////////

	/**
	 * Calcula la fecha de fin de la penalización sumando los días de penalización a
	 * la fecha de inicio de la penalización.
	 *
	 * @return la fecha de fin de la penalización
	 */
	public LocalDate calcularFechaFinPenalizacion() {
		return fecha_inicio_penalizacion.plusDays(dias_penalizacion);
	}

	/**
	 * Verifica si la penalización está en curso basándose en la fecha actual y la
	 * fecha de fin de la penalización.
	 *
	 * @return true si la penalización está en curso, false en caso contrario
	 */
	public boolean estaPenalizacionEnCurso() {
		LocalDate fechaFinPenalizacion = calcularFechaFinPenalizacion();
		return LocalDate.now().isBefore(fechaFinPenalizacion) || LocalDate.now().isEqual(fechaFinPenalizacion);
	}

	/**
	 * Muestra información detallada de la penalización, incluyendo las fechas
	 * formateadas.
	 *
	 * @return una cadena de texto con los detalles de la penalización
	 */
	public String mostrarDetallesPenalizacion() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Penalización ID: " + id_penalizacion + "\n" + "Préstamo ID: " + id_prestamo + "\n"
				+ "Días de penalización: " + dias_penalizacion + "\n" + "Fecha inicio penalización: "
				+ fecha_inicio_penalizacion.format(formatter) + "\n" + "Fecha fin penalización: "
				+ calcularFechaFinPenalizacion().format(formatter);
	}

}
