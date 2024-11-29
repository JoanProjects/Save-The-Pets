package modelo;

/**
 * Representa una mascota en el sistema. Esta clase sirve como DTO,
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

    public Mascotas() {
    }

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
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPesoKG() {
        return pesoKG;
    }

    public void setPesoKG(String pesoKG) {
        this.pesoKG = pesoKG;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getVacunacionEstado() {
        return vacunacionEstado;
    }

    public void setVacunacionEstado(String vacunacionEstado) {
        this.vacunacionEstado = vacunacionEstado;
    }

    public String getAdopcionEstado() {
        return adopcionEstado;
    }

    public void setAdopcionEstado(String adopcionEstado) {
        this.adopcionEstado = adopcionEstado;
    }

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
}