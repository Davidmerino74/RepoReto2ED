package biblioteca;

import java.util.Objects;

public class Persona {
    private String dni;
    private String nombre_completo;
    private String telefono;
    private String direccion;
    private String email;
    private String nombre_usuario;
    private String contrasena;
    private String n_segsocial;
    
    ////////////////////CONSTRUCTORES/////////////////////
	/** CONSTUCTOR COMPLETO
	 * @param dni
	 * @param nombre_completo
	 * @param telefono
	 * @param direccion
	 * @param email
	 * @param nombre_usuario
	 * @param contrasena
	 * @param n_segsocial
	 */
	public Persona(String dni, String nombre_completo, String telefono, String direccion, String email,
			String nombre_usuario, String contrasena, String n_segsocial) {
		super();
		this.dni = dni;
		this.nombre_completo = nombre_completo;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.nombre_usuario = nombre_usuario;
		this.contrasena = contrasena;
		this.n_segsocial = n_segsocial;
	}
	/** CONSTUCTOR PARA USUARIOS SIN NÚMERO SEGURIDAD SOCIAL
	 * @param dni
	 * @param nombre_completo
	 * @param telefono
	 * @param direccion
	 * @param email
	 * @param nombre_usuario
	 * @param contrasena
	 */
	public Persona(String dni, String nombre_completo, String telefono, String direccion, String email,
	        String nombre_usuario, String contrasena) {
	    super();
	    this.dni = dni;
	    this.nombre_completo = nombre_completo;
	    this.telefono = telefono;
	    this.direccion = direccion;
	    this.email = email;
	    this.nombre_usuario = nombre_usuario;
	    this.contrasena = contrasena;
	}

	
	////////////////////GETTERS AND SETTERS/////////////////////

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getN_segsocial() {
		return n_segsocial;
	}

	public void setN_segsocial(String n_segsocial) {
		this.n_segsocial = n_segsocial;
	}
	////////////////////toString/////////////////////
	@Override
	public String toString() {
		return "Personas [dni=" + dni + ", nombre_completo=" + nombre_completo + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", email=" + email + ", nombre_usuario=" + nombre_usuario
				+ ", contrasena=" + contrasena + ", n_segsocial=" + n_segsocial + "]";
	}
	////////////////////hashCode and equals/////////////////////
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}

	////////////////////INICIALIZACIÓN DE DATOS/////////////////////
	public static void main(String[] args) {
	// Crear objetos Personas
	Persona persona1 = new Persona("10123456Q", "Juanjo Lopez Menendez", "635702837", "barrio villa 18", "niko@hotmail.com", "niko", "456", "401234567897");
	Persona persona2 = new Persona("20456789I", "Pepe Luis", "365402547", "calle jota 20", "triko@gmail.com", "triko", "251541dft", "406589741234");
	Persona persona3 = new Persona("30789789P", "Jose Vidal Parro", "654321569", "calle del medio", "pepe@hotmail.com", "pepe2", "369jiuydd", "403265987452");
	Persona persona4 = new Persona("40896789T", "Laura Perez Gomez", "635784901", "Calle Falsa 123", "laura@gmail.com", "laurapg", "secure123", "409876543210");
	Persona persona5 = new Persona("50985647R", "Mario Castro Ruiz", "645987321", "Avenida Siempre Viva", "mario@yahoo.com", "mariocr", "123password", "408765432109");
	Persona persona6 = new Persona("61234578Q", "Ana Lopez", "685749120", "Calle Luna 45", "ana@hotmail.com", "analopez", "mypass456", "507689432101");
	Persona persona7 = new Persona("70956345W", "Luis Martinez", "625478963", "Paseo del Prado", "luis@gmail.com", "luism", "lu123456", "506781234509");
	Persona persona8 = new Persona("80123457E", "Sofia Gutierrez", "697854321", "Calle Sol 99", "sofia@gmail.com", "sofiagt", "sofiapass", "607894563210");
	Persona persona9 = new Persona("90765438Y", "Pablo Gonzalez", "657489012", "Avenida del Mar", "pablo@gmail.com", "pablog", "mypablo321", "706985123098");
	Persona persona10 = new Persona("10234567U", "Marta Sanchez", "637490215", "Callejón del Gato", "marta@gmail.com", "martas", "martapass", "807894563210");
	Persona persona11 = new Persona("20346789I", "Carlos Ruiz", "667840213", "Boulevard Norte", "carlos@hotmail.com", "carlosr", "carlos321", "908765432101");
	Persona persona12 = new Persona("30457890P", "Lucia Garcia", "627489305", "Plaza Mayor", "lucia@gmail.com", "luciag", "lucia123", "109876543210");
	Persona persona13 = new Persona("40568912K", "Jorge Ramirez", "617849023", "Calle Olivo", "jorge@gmail.com", "jorger", "jorgepass", "207689543210");
	
	// Imprimir datos para verificar
	System.out.println(persona1);
	System.out.println(persona2);
	System.out.println(persona3);
	System.out.println(persona4);
	System.out.println(persona5);
	System.out.println(persona6);
	System.out.println(persona7);
	System.out.println(persona8);
	System.out.println(persona9);
	System.out.println(persona10);
	System.out.println(persona11);
	System.out.println(persona12);
	System.out.println(persona13);
	}
    //////////////////// MÉTODOS AÑADIDOS ////////////////////
	/**
	 * Valida el formato del email de la persona.
	 *
	 * @return true si el formato del email es válido, false en caso contrario
	 */
	public boolean validarFormatoEmail() {
	    return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
	}
	/**
	 * Verifica si el número de teléfono tiene un formato válido.
	 *
	 * @return true si el número de teléfono es válido, false en caso contrario
	 */
	public boolean validarTelefono() {
	    return telefono.matches("\\d{9}");
	}


	
}

