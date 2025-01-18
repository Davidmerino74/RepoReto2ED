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

   
}

