package modelo;

/**
 * Clase que representa un usuario del sistema.
 * Contiene los atributos necesarios para la autenticación e información del usuario.
 * @author WilfredoFC
 */
public class Login {

    int id;
    String usuario;
    String clave;
    String nombre;
    String apellido;

    /**
     * Constructor por defecto de la clase Login.
     */
    public Login() {
    }

    /**
     * Constructor de la clase Login.
     * @param id El ID del usuario.
     * @param usuario El nombre de usuario.
     * @param clave La contraseña del usuario.
     */
    public Login(int id, String usuario, String clave) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
    }
    
    /**
     * Obtiene el ID del usuario.
     * @return El ID del usuario.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del usuario.
     * @param id El ID del usuario.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de usuario.
     * @return El nombre de usuario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el nombre de usuario.
     * @param usuario El nombre de usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     * @return La contraseña del usuario.
     */
    public String getClave() {
        return clave;
    }

    /**
     * Establece la contraseña del usuario.
     * @param clave La contraseña del usuario.
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * @param nombre El nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del usuario.
     * @return El apellido del usuario.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del usuario.
     * @param apellido El apellido del usuario.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}