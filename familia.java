public class familia {
    private String apellido;
    private int cantidadMiembros;
    private int cantidadKidsMenor10;
    private int cantidadKidsMayor10;
    private int cantidadMascotas;

    public familia(){
        apellido = "";
        cantidadMiembros = 0;
        cantidadKidsMenor10 = 0;
        cantidadKidsMayor10 = 0;
        cantidadMascotas = 0;
    }

    public familia(String apellido, String cantidadMiembros, String cantidadKidsMenor10, String cantidadKidsMayor10, String cantidadMascotas){
        this.apellido = apellido;
        this.cantidadMiembros = Integer.parseInt(cantidadMiembros);
        this.cantidadKidsMenor10 = Integer.parseInt(cantidadKidsMenor10);
        this.cantidadKidsMayor10 = Integer.parseInt(cantidadKidsMayor10);
        this.cantidadMascotas = Integer.parseInt(cantidadMascotas);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCantidadMiembros() {
        return cantidadMiembros;
    }

    public void setCantidadMiembros(int cantidadMiembros) {
        this.cantidadMiembros = cantidadMiembros;
    }

    public int getcantidadKidsMenor10() {
        return cantidadKidsMenor10;
    }

    public void setcantidadKidsMenor10(int cantidadKidsMenor10) {
        this.cantidadKidsMenor10 = cantidadKidsMenor10;
    }

    public int getCantidadKidsMayor10() {
        return cantidadKidsMayor10;
    }

    public int getCantidadMascotas() {
        return cantidadMascotas;
    }

    public void setCantidadMascotas(int cantidadMascotas) {
        this.cantidadMascotas = cantidadMascotas;
    }
}
