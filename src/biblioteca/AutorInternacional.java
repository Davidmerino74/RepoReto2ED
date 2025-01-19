package biblioteca;

public class AutorInternacional extends Autores {
	private String pais;

	//////////////////// CONSTRUCTORES ///////////////////////		
	/**
	 * CONSTRUCTOR COMPLETO
	 *
	 * @param id_autor  
	 * @param nombre   
	 * @param apellidos 
	 * @param pais     .
	 */
	public AutorInternacional(int id_autor, String nombre, String apellidos, String pais) {
		super(id_autor, nombre, apellidos);
		this.pais = pais;
	}


	//////////////////// GETTERS AND SETTERS ///////////////////////
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	//////////////////// toString ///////////////////////
	@Override
	public String toString() {
		return super.toString() + ", País: " + pais;
	}

	//////////////////// RESUELVO MÉTODO ABSTRACTO ///////////////////////
	@Override
	public String obtenerTipoAutor() {
		return "Autor Internacional - País: " + pais;
	}

	//////////////////// MÉTODO ADICIONAL ///////////////////////
	/**
	 * Devuelve el idioma principal del autor según su país.
	 *
	 * @return el idioma principal del país del autor. Si el país no está en la lista,
	 *         devuelve "Idioma desconocido".
	 */
	public String idiomaPrincipal() {
		switch (pais.toLowerCase()) {
		case "españa":
		case "méxico":
		case "colombia":
			return "Español";
		case "francia":
			return "Francés";
		case "reino unido":
		case "estados unidos":
			return "Inglés";
		default:
			return "Idioma desconocido";
		}
	}

}

