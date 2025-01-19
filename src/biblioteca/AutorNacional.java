package biblioteca;

public class AutorNacional extends Autores {
	private String region;

	//////////////////// CONSTRUCTORES ///////////////////////
	/**
	 * CONSTRUCTOR COMPLETO
	 *
	 * @param id_autor  
	 * @param nombre   
	 * @param apellidos 
	 * @param region   
	 */
	public AutorNacional(int id_autor, String nombre, String apellidos, String region) {
	    super(id_autor, nombre, apellidos);
	    this.region = region;
	}


	//////////////////// GETTERS AND SETTERS ///////////////////////
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	//////////////////// toString ///////////////////////
	@Override
	public String toString() {
		return super.toString() + ", Región: " + region;
	}

	//////////////////// RESUELVO MÉTODO ABSTRACTO ///////////////////////
	@Override
	public String obtenerTipoAutor() {
		return "Autor Nacional - Región: " + region;
	}

	//////////////////// MÉTODO ADICIONAL ///////////////////////
	/**
	 * Devuelve un mensaje indicando la región a la que pertenece el autor.
	 *
	 * @return una cadena de texto con un mensaje que indica la región del autor.
	 */
	public String mensajeRegional() {
	    return "Este autor pertenece a la región: " + region;
	}


}
