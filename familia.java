/**
 * Clase que nos sirve para crear objetos de familia
 */

public class familia {
    private String apellido;
    private int cantidadMiembros;
    private int cantidadKidsMenor10;
    private int cantidadKidsMayor10;
    private int cantidadMascotas;

    /**
     * Constructor de la clase
     */
    public familia(){
        apellido = "";
        cantidadMiembros = 0;
        cantidadKidsMenor10 = 0;
        cantidadKidsMayor10 = 0;
        cantidadMascotas = 0;
    }

    /**
     * Overload del constructor que nos permite definir los valores desde el inicio por el usuario
     * @param apellido = apellido de la familia
     * @param cantidadMiembros = cantidad de miembros de la familia
     * @param cantidadKidsMenor10 = cantidad de niños menores de 10 años
     * @param cantidadKidsMayor10 = cantidad de niños mayores de 10 años
     * @param cantidadMascotas = cantidad de mascotas adoptadas
     */
    public familia(String apellido, String cantidadMiembros, String cantidadKidsMenor10, String cantidadKidsMayor10, String cantidadMascotas){
        this.apellido = apellido;
        this.cantidadMiembros = Integer.parseInt(cantidadMiembros);
        this.cantidadKidsMenor10 = Integer.parseInt(cantidadKidsMenor10);
        this.cantidadKidsMayor10 = Integer.parseInt(cantidadKidsMayor10);
        this.cantidadMascotas = Integer.parseInt(cantidadMascotas);
    }

    /**
     * Obtenemos el valor de apellido
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtenemos el valor de cantidadMiembros
     * @return
     */
    public int getCantidadMiembros() {
        return cantidadMiembros;
    }

    /**
     * Obtenemos el valor de cantidadKidsMenor10
     * @return
     */
    public int getcantidadKidsMenor10() {
        return cantidadKidsMenor10;
    }

    /**
     * Obtenemos el valor de cantidadKidsMayor10
     * @return
     */
    public int getCantidadKidsMayor10() {
        return cantidadKidsMayor10;
    }

    /**
     * Obtenemos el valor de cantidadMascotas
     * @return
     */
    public int getCantidadMascotas() {
        return cantidadMascotas;
    }

    /**
     * Establecemos el nuevo valor de cantidad Mascotas
     * @param cantidadMascotas
     */
    public void setCantidadMascotas(int cantidadMascotas) {
        this.cantidadMascotas = cantidadMascotas;
    }
}
