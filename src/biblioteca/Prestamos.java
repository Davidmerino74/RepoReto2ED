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

    
}

