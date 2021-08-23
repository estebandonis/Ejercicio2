/**
* Esta clase es la que se encarga de conectar al usuario con el programa
*/

import java.util.Scanner;

public class Vista {
    private Scanner scan = new Scanner(System.in);
    /**
     * Este metodo se encarga de darle la bienvenida al programa
     */
    public void bienvenida(){
        System.out.println("Bienvenid@ a nuestro programa de asistencia a caninos perdidos");
    }

    /**
     * Este metodo sirve para darle las opciones al usuario y regresarle la opcion seleccionada al programa
     * @return option = variable con la opcion
     */
    public int pedirOpcion(){
        System.out.println("Elija una opción:");
		System.out.println("1. Registrar una nueva familia");//Le damos todas las opciones disponibles
		System.out.println("2. Registrar un nuevo can");
		System.out.println("3. Asignar a un perro");
        System.out.println("4. Imprimir lista de familias");
        System.out.println("5. Imprimir lista de perros");
        System.out.println("6. Salir/n/n");

        String optionString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
        int option = Integer.parseInt(optionString);//Lo cambiamos a Integer
        return option;//regresamos el valor convertido
    }

    /**
     * Este metodo se usa para pedir los datos de un nuevo perro para ingresarlo al sistema de adopcion temporal
     * @return datos = array con los datos del perro
     */
    public String[] pedirDatosCanino(){
        String[] datos = new String[6];// Creamos un nuevo array para guardar los datos
        System.out.println("¿De qué tamaño es el perro? (Escriba pequeño, mediano o grande)");
        datos[0] = scan.nextLine();//Vamos guardando los datos en los diferentes espacios
        System.out.println("¿De qué raza es el perro? (Si no se conoce coloque 'mestizo')");
        datos[1] = scan.nextLine();
        System.out.println("¿Cuál es la edad aproximada del perro? (En años perrunos)");
        datos[2] = scan.nextLine();
        System.out.println("¿Cuál es el estado de salud del perro? (De 0 a 100)");
        datos[3] = scan.nextLine();
        System.out.println("¿Cuál es el color del perro?");
        datos[4] = scan.nextLine();
        System.out.println("¿Cuál es el nombre del perro? (Si no tiene, inventese uno)");
        datos[5] = scan.nextLine();

        return datos;//Regresamos el array con los datos
    }

    /**
     * Metodo que nos sirve para pedir los datos de una nueva familia
     * @return datos = array con los datos de la familia
     */
    public String[] pedirDatosFamilia(){
        String[] datos = new String[5];//Creamos un neuvo array para guardar los datos
        System.out.println("¿Cuál es el primer apellido de su familia?");
        datos[0] = scan.nextLine();//Vamos asignando los datos en los diferentes espacion del array 
        System.out.println("¿Cuántos miembros hay en su familia?");
        datos[1] = scan.nextLine();
        System.out.println("¿Cuántos niños menores de 10 años tiene?");
        datos[2] = scan.nextLine();
        System.out.println("¿Cuántos niños mayores de 10 años tiene?");
        datos[3] = scan.nextLine();
        System.out.println("¿Cuántas mascotas tiene adoptadas? (max 4)");
        datos[4] = scan.nextLine();

        return datos;//Regresamos el array con los datos
    }

    /**
     * Sirve para avisarle al usuario que el cupo esta lleno y no se puede agregar ningun elemento mas
     */
    public void noCupo(){
        System.out.println("El cupo ya está lleno");
    }

    /**
     * Este metodo sirve para decirle que se agregaron los datos exitosamente
     */
    public void Cupo(){
        System.out.println("Se agregó exitosamente");
    }
    
    /**
     * Este metodo sirve para imprimir la lista de perros registrados
     * @param datosCan = datos de los perros
     * @param limite = cantidad de perros registrados
     */
    public void printCan(perro[] datosCan, int limite){
        for (int fila = 0; fila < limite; fila++){
            System.out.println("---------------------------------");
            System.out.println("Perro: " + fila);
            System.out.println("Contenido: ");
            System.out.println("Tamaño: " + datosCan[fila].getSize());//Vamos extrayendo los datos de la base de datos y los vamos imprimiendo conforme los vamos extrayendo
            System.out.println("Raza: " + datosCan[fila].getRaza());
            System.out.println("Edad Aproximada: " + datosCan[fila].getEdadAproximada());
            System.out.println("Estado de salud: " + datosCan[fila].getNivelSalud());
            System.out.println("Color: " + datosCan[fila].getColor());
            System.out.println("Nombre: " + datosCan[fila].getNombre());
            System.out.println("Asignado: " + datosCan[fila].getAsignado());
            System.out.println("---------------------------------");
        }
    }

    /**
     * Metodo usado para decirle al usuario que perro quiere asignar
     * @return respuestaInt = El numero de perro a asignar
     */
    public int perroACambiar(){
        System.out.println("Elija un perro mediante el número del campo 'Perro'");
        String respuesta = scan.nextLine();
        int respuestaInt = Integer.parseInt(respuesta);
        return respuestaInt;
    }

    /**
     * Metodo que sirve para imprimir la lista de familias registradas
     * @param datosFam = base de datos de las familias
     * @param limite = cantidad de familias registradas
     */
    public void printFam(familia[] datosFam, int limite){
        for (int fila = 0; fila < limite; fila++){
            System.out.println("---------------------------------");
            System.out.println("Familia: " + fila);
            System.out.println("Contenido: ");
            System.out.println("Apellido: " + datosFam[fila].getApellido());
            System.out.println("Cantidad de Miembros: " + datosFam[fila].getCantidadMiembros());
            System.out.println("Cantidad de niños (-10 años): " + datosFam[fila].getcantidadKidsMenor10());
            System.out.println("Cantidad de niños (+10 años): " + datosFam[fila].getCantidadKidsMayor10());
            System.out.println("Cantidad de mascotas: " + datosFam[fila].getCantidadMascotas());
            System.out.println("---------------------------------");
        }
    }

    /**
     * Le avisa al usuario que el perro se asigno a la perrera
     */
    public void perrera(){
        System.out.println("El perro fue ubicado en la perrera");
    }

    /**
     * Le avisa al usuario que el perro fue asignado correctamente
     */
    public void asignado(){
        System.out.println("El perro fue asignado correctamente");
    }

    /**
     * Le avisa al usuario que el perro elegido ya tiene asignacion
     */
    public void perroYaAsignado(){
        System.out.println("El perro elegido ya fue asignado");
    }
}