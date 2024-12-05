package modelo;

/**
 * Representa una mascota en el sistema. Esta clase sirve como DTO (Data Transfer Object),
 * encapsulando los atributos de una mascota, 
 * como su nombre, especie, raza y estado de adopción.
 * 
 * @author JoanArroyo
 */
public class Mascotas {

    int id;
    String nombre;
    String sexo;
    String pesoKG;
    String especie;
    String raza;
    String vacunacionEstado;
    String adopcionEstado;
    String colaborador;
    String buscar; /* buscar, para implementar funcionalidad de buscar 
                      y filtrar datos de busqueda de las mascotas*/

    /**
     * Constructor por defecto de la clase Mascotas.
     */
    public Mascotas() {
    }

    /**
     * Constructor de la clase Mascotas.
     * @param id El ID de la mascota.
     * @param nombre El nombre de la mascota.
     * @param sexo El sexo de la mascota.
     * @param pesoKG El peso de la mascota en kg.
     * @param especie La especie de la mascota.
     * @param raza La raza de la mascota.
     * @param vacunacionEstado El estado de vacunación de la mascota.
     * @param adopcionEstado El estado de adopción de la mascota.
     * @param colaborador El nombre del colaborador a cargo.
     * @param buscar Campo para la búsqueda y filtrado de mascotas.
     */
    public Mascotas(int id, String nombre, String sexo, String pesoKG, 
                    String especie, String raza, String vacunacionEstado, 
                    String adopcionEstado, String colaborador, String buscar) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.pesoKG  = pesoKG;
        this.especie  = especie;
        this.raza = raza;
        this.vacunacionEstado = vacunacionEstado;
        this.adopcionEstado = adopcionEstado;
        this.colaborador = colaborador;
        this.buscar    = buscar;
    }
    
    /**
     * Obtiene el ID de la mascota.
     * @return El ID de la mascota.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la mascota.
     * @param id El ID de la mascota.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la mascota.
     * @return El nombre de la mascota.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la mascota.
     * @param nombre El nombre de la mascota.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el sexo de la mascota.
     * @return El sexo de la mascota.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Establece el sexo de la mascota.
     * @param sexo El sexo de la mascota.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Obtiene el peso de la mascota en kg.
     * @return El peso de la mascota en kg.
     */
    public String getPesoKG() {
        return pesoKG;
    }

    /**
     * Establece el peso de la mascota en kg.
     * @param pesoKG El peso de la mascota en kg.
     */
    public void setPesoKG(String pesoKG) {
        this.pesoKG = pesoKG;
    }

    /**
     * Obtiene la especie de la mascota.
     * @return La especie de la mascota.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Establece la especie de la mascota.
     * @param especie La especie de la mascota.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Obtiene la raza de la mascota.
     * @return La raza de la mascota.
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Establece la raza de la mascota.
     * @param raza La raza de la mascota.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Obtiene el estado de vacunación de la mascota.
     * @return El estado de vacunación de la mascota.
     */
    public String getVacunacionEstado() {
        return vacunacionEstado;
    }

    /**
     * Establece el estado de vacunación de la mascota.
     * @param vacunacionEstado El estado de vacunación de la mascota.
     */
    public void setVacunacionEstado(String vacunacionEstado) {
        this.vacunacionEstado = vacunacionEstado;
    }

    /**
     * Obtiene el estado de adopción de la mascota.
     * @return El estado de adopción de la mascota.
     */
    public String getAdopcionEstado() {
        return adopcionEstado;
    }

    /**
     * Establece el estado de adopción de la mascota.
     * @param adopcionEstado El estado de adopción de la mascota.
     */
    public void setAdopcionEstado(String adopcionEstado) {
        this.adopcionEstado = adopcionEstado;
    }

    /**
     * Obtiene el nombre del colaborador a cargo.
     * @return El nombre del colaborador a cargo.
     */
    public String getColaborador() {
        return colaborador;
    }

    /**
     * Establece el nombre del colaborador a cargo.
     * @param colaborador El nombre del colaborador a cargo.
     */
    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    /**
     * Obtiene el campo de búsqueda para filtrar mascotas.
     * @return El texto de búsqueda.
     */
    public String getBuscar() {
        return buscar;
    }

    /**
     * Establece el texto de búsqueda para filtrar mascotas.
     * @param buscar El texto de búsqueda.
     */
    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
}