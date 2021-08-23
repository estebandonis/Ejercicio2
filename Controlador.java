/**
* Sistema para asignar perros en hogares temporales
* Esta clase es la que se encarga de correr todo el programa
* @author: Esteban Donis
* @version: 0.1, 2021/08/22
*/

public class Controlador {
    /**
     * Este metodo es el que ejecuta todo el programa
     * @param args
     */
    public static void main(String[] args) {
        Sistema system = new Sistema();//Instanciamos la clase sistema
        Vista vis = new Vista();//Instanciamos la clase de vista
        int opcion = 0;//Creamos la variable donde guardaremos la opcion que elija el usuario
        boolean max = false;//La creamos para verificar si se ha llegado al limite de elementos en los arrays.
        String[] datosFam1 = {"Martinez", "4", "0", "0", "0"};//Los creamos para llenar un poco nuestras bases de datos
        String[] datosFam2 = {"Canales", "6", "2", "1", "2"};
        String[] datosFam3 = {"Valladares", "2", "0", "0", "1"};
        String[] datosDog1 = {"pequeño", "mestizo", "4", "50", "cafe", "Polo"};
        String[] datosDog2 = {"mediano", "Pit bull terrier", "10", "60", "negro", "Pablo"};
        String[] datosDog3 = {"grande", "Tosa Inu", "8", "70", "negro", "Catty"};
        
        system.nuevaFamilia(datosFam1);//Instroducimos los datos en las bases de datos
        system.nuevaFamilia(datosFam2);
        system.nuevaFamilia(datosFam3);
        system.nuevoPerro(datosDog1);
        system.nuevoPerro(datosDog2);
        system.nuevoPerro(datosDog3);

        vis.bienvenida();//Le damos la bienvenida al usuario

        while (opcion != 6){//Abrimos el bucle para nuestro menu

            opcion = vis.pedirOpcion();//Recibimos la opcion del usuario
            if (opcion == 1) {//Si el usuario elige la opcion 1
                String[] datos = vis.pedirDatosFamilia();//Obtenemos los datos de familia
                max = system.nuevaFamilia(datos);//Agregamos la nueva familia y obtenemos un boolean
                if (max == true){//Con el boolean definimos si el maximo de elementos se alcanco, si no es asi
                    vis.Cupo();//Le decimos al usuario que se agrego exitosamente
                }
                else{//Si es asi
                    vis.noCupo();//Le decimos que ya no hay cupo
                }
            }
            else if (opcion == 2){//Si el usuario elige la opcion 1
                String[] datos = vis.pedirDatosCanino();//Obtenemos los datos de perro
                max = system.nuevoPerro(datos);//Agregamos la nueva familia y obtenemos un boolean
                if (max == true){//Con el boolean definimos si el maximo de elementos se alcanco, si no es asi
                    vis.Cupo();//Le decimos al usuario que se agrego exitosamente
                }
                else{//Si es asi
                    vis.noCupo();//Le decimos que ya no hay cupo
                }
            }
            else if (opcion == 3){//Si el usuario elige la opcion 3
                vis.printCan(system.getDog(), system.getNumPerro());//Imprimos la lista de perros
                int perroACambiar = vis.perroACambiar();//Obtenemos el numero del perro que vamos a cambiar
                boolean asignado = system.getAsignado(perroACambiar);//Revisamos si el perro ya esta asignado
                if (asignado == false){//Si no esta asignado
                    boolean logroAsignarse = system.asignarCan(perroACambiar);//Ejecutamos la asignacion y recibimos un boolean
                    if (logroAsignarse == true){//Si es true
                        system.setAsignado(perroACambiar, true);//Cambiamos el valor de la variable asignado
                        vis.asignado();//Le avisamos al usuario
                    }
                    else{//Si es false
                        system.setAsignado(perroACambiar, true);//Le cambiamos el valor de asignado 
                        vis.perrera();//Le hacemos saber al usuario que se asigno a la perrera
                    }
                }
                else{//Si ya esta asignado
                    vis.perroYaAsignado();//Se lo hacemos saber al usuario
                }
            }
            else if (opcion == 4){//Si el usuario elige la opcion 4
                vis.printFam(system.getFam(), system.getNumFamilia());//Se imprime la lista de familias
            }
            else if (opcion == 5){//Si el usuario elige la opcion 1
                vis.printCan(system.getDog(), system.getNumPerro());//Se imprime la lista de perros
            }
            else if (opcion == 6){//Si el usuario elige la opcion 1
                System.exit(0);//Se sale del programa
            }
            else{
                System.out.println("Ingrese una opcion valida");
            }
        }
    }
}