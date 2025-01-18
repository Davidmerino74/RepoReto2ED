package biblioteca;

import java.util.Date;

public class Penalizaciones {
    private int id_penalizacion;
    private int id_prestamo;
    private int dias_penalizacion;
    private Date fecha_inicio_penalizacion;
    
    ////////////////////CONSTRUCTORES/////////////////////
	/** CONSTUCTOR COMPLETO
	 * @param id_penalizacion
	 * @param id_prestamo
	 * @param dias_penalizacion
	 * @param fecha_inicio_penalizacion
	 */
	public Penalizaciones(int id_penalizacion, int id_prestamo, int dias_penalizacion, Date fecha_inicio_penalizacion) {
		super();
		this.id_penalizacion = id_penalizacion;
		this.id_prestamo = id_prestamo;
		this.dias_penalizacion = dias_penalizacion;
		this.fecha_inicio_penalizacion = fecha_inicio_penalizacion;
	}

    
}

