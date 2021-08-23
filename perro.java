public class perro {
    private String size;
    private String raza;
    private int edadAproximada;
    private int nivelSalud;
    private String color;
    private String nombre;
    private boolean asignado;

    public perro(){
        size = "";
        raza = "";
        edadAproximada = 0;
        nivelSalud = 0;
        color = "";
        nombre = "";
        asignado = false;
    }

    public perro (String size, String raza, String edadAproximada, String nivelSalud, String color, String nombre, boolean asignado){
        this.size = size;
        this.raza = raza;
        this.edadAproximada = Integer.parseInt(edadAproximada);
        this.nivelSalud = Integer.parseInt(nivelSalud);
        this.color = color;
        this.nombre = nombre;
        this.asignado = asignado;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdadAproximada() {
        return edadAproximada;
    }

    public void setEdadAproximada(int edadAproximada) {
        this.edadAproximada = edadAproximada;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean getAsignado(){
        return asignado;
    }

    public void setAsignado(boolean asignado){
        this.asignado = asignado;
    }
}
