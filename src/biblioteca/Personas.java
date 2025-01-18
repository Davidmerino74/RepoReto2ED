package biblioteca;

public class Personas {
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
	public Personas(String dni, String nombre_completo, String telefono, String direccion, String email,
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


	
}

