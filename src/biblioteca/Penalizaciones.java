package biblioteca;

import java.util.Date;
import java.util.Objects;

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
	////////////////////GETTERS AND SETTERS/////////////////////

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

	public Date getFecha_inicio_penalizacion() {
		return fecha_inicio_penalizacion;
	}

	public void setFecha_inicio_penalizacion(Date fecha_inicio_penalizacion) {
		this.fecha_inicio_penalizacion = fecha_inicio_penalizacion;
	}
	////////////////////toString/////////////////////
	@Override
	public String toString() {
		return "Penalizaciones [id_penalizacion=" + id_penalizacion + ", id_prestamo=" + id_prestamo
				+ ", dias_penalizacion=" + dias_penalizacion + ", fecha_inicio_penalizacion="
				+ fecha_inicio_penalizacion + "]";
	}

	////////////////////hashCode and equals/////////////////////	
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
		Penalizaciones other = (Penalizaciones) obj;
		return id_penalizacion == other.id_penalizacion && id_prestamo == other.id_prestamo;
	}

	

	
	
}

