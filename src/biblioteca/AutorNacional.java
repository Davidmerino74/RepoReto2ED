package biblioteca;

public class AutorNacional extends Autor {
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

	public static void main(String[] args) {
	//////////////////// INICIALIZACIÓN DE DATOS ///////////////////////

		// Crear Objetos Autores Nacionales
		AutorNacional autor1 = new AutorNacional(1, "Gabriel", "García Márquez", "Colombia");
		AutorNacional autor2 = new AutorNacional(2, "Julio", "Cortázar", "Argentina");
		AutorNacional autor3 = new AutorNacional(3, "Miguel", "de Cervantes", "España");
		AutorNacional autor4 = new AutorNacional(4, "J.K.", "Rowling", "Reino Unido");
		AutorNacional autor5 = new AutorNacional(5, "F. Scott", "Fitzgerald", "Estados Unidos");

		// Imprimir datos para verificar
		System.out.println("Autores Nacionales:");
		System.out.println(autor1);
		System.out.println(autor2);
		System.out.println(autor3);
		System.out.println(autor4);
		System.out.println(autor5);

		//////////////////// PRUEBAS DE MÉTODOS para verificar ///////////////////////
		System.out.println("\nPruebas de métodos de AutorNacional:");
		System.out.println(autor1.mensajeRegional());
	}

}
