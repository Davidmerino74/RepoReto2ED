package biblioteca;

import java.util.Date;

public class Prestamos {
    private int id_prestamo;
    private int id_ejemplar;
    private String dni;
    private int n_max_prestado;
    private Date fecha_prestamo;
    private Date fecha_limite_devolucion;
    private Date fecha_efectiva_devolucion;
    
    ////////////////////CONSTRUCTORES/////////////////////
	/** CONSTUCTOR COMPLETO
	 * @param id_prestamo
	 * @param id_ejemplar
	 * @param dni
	 * @param n_max_prestado
	 * @param fecha_prestamo
	 * @param fecha_limite_devolucion
	 * @param fecha_efectiva_devolucion
	 */
	public Prestamos(int id_prestamo, int id_ejemplar, String dni, int n_max_prestado, Date fecha_prestamo,
			Date fecha_limite_devolucion, Date fecha_efectiva_devolucion) {
		super();
		this.id_prestamo = id_prestamo;
		this.id_ejemplar = id_ejemplar;
		this.dni = dni;
		this.n_max_prestado = n_max_prestado;
		this.fecha_prestamo = fecha_prestamo;
		this.fecha_limite_devolucion = fecha_limite_devolucion;
		this.fecha_efectiva_devolucion = fecha_efectiva_devolucion;
	}
	
	////////////////////GETTERS AND SETTERS/////////////////////

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

	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}

	public void setFecha_prestamo(Date fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}

	public Date getFecha_limite_devolucion() {
		return fecha_limite_devolucion;
	}

	public void setFecha_limite_devolucion(Date fecha_limite_devolucion) {
		this.fecha_limite_devolucion = fecha_limite_devolucion;
	}

	public Date getFecha_efectiva_devolucion() {
		return fecha_efectiva_devolucion;
	}

	public void setFecha_efectiva_devolucion(Date fecha_efectiva_devolucion) {
		this.fecha_efectiva_devolucion = fecha_efectiva_devolucion;
	}
	
	
    
}

