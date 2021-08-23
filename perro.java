/**
 * Esta clase sirve para crear nuevos perros
 */

public class perro {
    private String size;
    private String raza;
    private int edadAproximada;
    private int nivelSalud;
    private String color;
    private String nombre;
    private boolean asignado;

    /**
     * Es el constructor de la clase
     */
    public perro(){
        size = "";
        raza = "";
        edadAproximada = 0;
        nivelSalud = 0;
        color = "";
        nombre = "";
        asignado = false;
    }

    /**
     * Metodo de overloading para asignarle las caracteristicas por el usuario
     * @param size = tamaño del perro
     * @param raza = raza del perro
     * @param edadAproximada = edad aproximada del perro
     * @param nivelSalud = nivel de salud del perro
     * @param color = color del perro
     * @param nombre = nombre del perro
     * @param asignado = si el perro esta asignado o no
     */
    public perro (String size, String raza, String edadAproximada, String nivelSalud, String color, String nombre, boolean asignado){
        this.size = size;
        this.raza = raza;
        this.edadAproximada = Integer.parseInt(edadAproximada);
        this.nivelSalud = Integer.parseInt(nivelSalud);
        this.color = color;
        this.nombre = nombre;
        this.asignado = asignado;
    }

    /**
     * Obtenemos el tamaño del perro
     * @return tamaño del perro
     */
    public String getSize() {
        return size;
    }

    /**
     * Establecemos el nuevo valor del tamaño
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Obtenemos la raza del perro
     * @return
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Establecemos el nuevo valor de la raza
     * @param raza = nueva raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Obtenemos el valor de la edad aproximada
     * @return
     */
    public int getEdadAproximada() {
        return edadAproximada;
    }

    /**
     * Establecemos el nuevo valor de la edadAproximada
     * @param edadAproximada = nuevo valor de edad aproximada
     */
    public void setEdadAproximada(int edadAproximada) {
        this.edadAproximada = edadAproximada;
    }

    /**
     * Obtenemos el valor del nivel de salud
     * @return
     */
    public int getNivelSalud() {
        return nivelSalud;
    }

    /**
     * Establecemos el nuevo valor del nivel de slaud
     * @param nivelSalud = nuevo valor del nivel de salud
     */
    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    /**
     * Obtenemos el valor de color
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Establecemos el nuevo valor del color
     * @param color = nuevo valor de color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtenemos el valor del nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establecemos el nuevo valor del nombre
     * @param nombre = nuevo valor del nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtenemos el valor de asignado
     * @return
     */
    public boolean getAsignado(){
        return asignado;
    }

    /**
     * Establecemos el nuevo valor de asignado
     * @param asignado = nuevo valor de asignado
     */
    public void setAsignado(boolean asignado){
        this.asignado = asignado;
    }
}
