/**
 * Esta clase es la que maneja toda la logica, y comunica al controlador con perro y familia
 */

public class Sistema {
    private familia[] fam = new familia[15];//Base de datos de familias
    private perro[] dog = new perro[30];//Base de datos de perros
    private int numFamilia;//Cantidad de elementos en la base de datos
    private int numPerro;//Cantidad de elementos en la base de datos
    private boolean seAgrego;//Para saber si se agrego el elemento
    //Base de datos de perros peligrosos
    public String[] perrosPeligrosos = {"Pit bull terrier", "American Staffordshire terrier", "Tosa Inu", "Dogo argentino", "Dogo Guatemalteco", "Fila brasileño", "Presa canario", "Dóberman", "Gran perro japonés", "Mastín napolitano", "Presa Mallorqui", "Dogo de burdeos", "Bullmastiff", "Bull terrier inglés", "Bulldog americano", "Rhodesiano", "Rottweiler"};
    private boolean asignado;//Nos ayuda a saber si esta asignado o no

    /**
     * Constructor de la clase
     */
    Sistema(){
        numFamilia = 0;
        numPerro = 0;
        asignado = false;
    }

    /**
     * Metodo que se usa para crear una nueva familia
     * @param datos = datos de la familia proporcionada por el usuario
     * @return seAgrego = nos dice si se agrego con exito o si el cupo esta lleno
     */
    public boolean nuevaFamilia(String[] datos){
        if (numFamilia < 15){//Revismos que hay cupo
            String apellido = datos[0];//Jalamos los datos de la base que nos enviaron
            String cantidadMiembros = datos[1];
            String cantidadKidsMenor10 = datos[2];
            String cantidadKidsMayor10 = datos[3];
            String cantidadMascotas = datos[4];
            familia nuevaFam = new familia(apellido, cantidadMiembros, cantidadKidsMenor10, cantidadKidsMayor10, cantidadMascotas);//Con estos datos creamos una nueva familia
            fam[numFamilia] = nuevaFam;//Agregamos la nueva familia a la base
            numFamilia += 1;//Le sumamos uno a nuestro contador
            seAgrego = true;//Avisamos que se agrego
        }
        else{//Si no hay cupo le decimos que no hay cupo al usuario
            seAgrego = false;
        }
        return seAgrego;//Regresamos el valor
    }

    /**
     * Metodo que sirve para agregar un nuevo perro
     * @param datos = datos del perro proporcionado por el usuario
     * @return seAgrego = Nos dice si se agrego con exito el perro o si ya no hay cupo
     */
    public boolean nuevoPerro(String[] datos){
        if (numPerro < 30){//Revismos que hay cupo
            String size = datos[0];//Jalamos los datos de la base que nos enviaron
            String raza = datos[1];
            String edadAproximada = datos[2];
            String nivelSalud = datos[3];
            String color = datos[4];
            String nombre = datos[5];
            boolean asignado = false;
            perro nuevoDog = new perro(size, raza, edadAproximada, nivelSalud, color, nombre, asignado);//Con estos datos creamos una nueva perro
            dog[numPerro] = nuevoDog;//Agregamos el nuevo perro a la base de datos
            numPerro += 1;//Le sumamos uno a nuestro contador
            seAgrego = true;//Avisamos que se agrego
        }
        else{//Si no hay cupo le decimos que no hay cupo al usuario
            seAgrego = false;
        }
        return seAgrego;//Regresamos el valor
    }

    /**
     * Metodo que se usa para asignar un perro con una familia
     * @param fila = numero de perro a asignar
     * @return Si se logro asignar a una familia o no
     */
    public boolean asignarCan(int fila){
        String size = dog[fila].getSize();//Obtenemos el tamaño del perro
        String raza = dog[fila].getRaza();//Obtenemos su raza
        boolean isPerroAsignado = dog[fila].getAsignado();//Obtenemos el valor si el perro esta asignado
        if (isPerroAsignado == false){//Verificamos si el falso
            for (int a = 0; a < 17; a++){//Creamos un bucle para recorrer la lista de perros peligrosos
                if (raza == perrosPeligrosos[a]){//Verificamos si es raza peligrosa
                    for (int k = 0; k < 15; k++){//Creamos un bucle para la base de datos de familia 
                        if (fam[k].getCantidadMascotas() < 4){//Verificamos si la familia ya tiene mas de 3 mascotas
                            if (fam[k].getcantidadKidsMenor10() == 0 && fam[k].getCantidadKidsMayor10() == 0){//Verificamos si la familia no tiene niños
                                int cantMascotas = fam[k].getCantidadMascotas();//Obtenemos la cantidad de mascotas
                                cantMascotas += 1;//Le sumamos uno
                                fam[k].setCantidadMascotas(cantMascotas);//Cambiamos el valor de cantidad de mascotas de la familia
                                asignado = true;//Cambiamos el valor de asignado
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            if (asignado == false){//verificamos que no se cumplio las condiciones anteriores
                if (size == "pequeño"){//Si el tamaño es pequeño
                    for (int i = 0; i < 15; i++){//Recorremos la base de dato de familia
                        int cantMascotas = fam[i].getCantidadMascotas();//Obtenemos la cantidad de mascotas de la familia 
                        if (cantMascotas < 4){//Verificamos si no la cantidad de mascotas es menor a 4
                            cantMascotas += 1;//Le sumamos uno
                            fam[i].setCantidadMascotas(cantMascotas);//La substituimos por el nuevo valor en la familia
                            asignado = true;//Cambiamos el valor de asignado
                            break;    
                        }
                    }
                }
                else if (size == "mediano"){//Verificamos si el tamaño es mediano
                    for (int o = 0; o < 15; o++){//Recorremos la base de dato de familia
                        int cantMascotas = fam[o].getCantidadMascotas();
                        if (cantMascotas < 4){
                            if (fam[o].getcantidadKidsMenor10() == 0){
                                cantMascotas += 1;
                                fam[0].setCantidadMascotas(cantMascotas);
                                asignado = true;
                                break;  
                            }
                        }
                    }
                }
                else if (size == "grande"){//Hacemos la verificacion si el tamaño es grande
                    for (int p = 0; p < 15; p++){
                        int cantMascotas = fam[p].getCantidadMascotas();
                        if (cantMascotas < 4){
                            if (fam[p].getcantidadKidsMenor10() == 0 && fam[p].getCantidadKidsMayor10() == 0){
                                cantMascotas += 1;
                                fam[p].setCantidadMascotas(cantMascotas);
                                asignado = true;
                                break;  
                            }
                        }
                    }
                }
            }
            return asignado;
        }
        else{
            return asignado;
        }
    }

    /**
     * Metodo que nos dice si el perro ya esta asignado en alguna familia
     * @param fila = numero de perro asignado
     * @return asignado = si esta asignado con una familia
     */
    public boolean getAsignado(int fila){
        boolean asignado = dog[fila].getAsignado();//Obtenemos el valor de asignado
        return asignado;
    }

    /**
     * Metodo que usamos para cambiar el valor de asignado
     * @param fila = numero de perro asignado
     * @param asignado = nuevo valor
     */
    public void setAsignado(int fila, boolean asignado){
        dog[fila].setAsignado(asignado);//Asignamos el nuevo valor de asignado
    }

    /**
     * Asi obtenemos la base de datos de perros
     * @return dog = base de datos de los perros
     */
    public perro[] getDog() {
        return dog;
    }

    /**
     * Metodo que nos da la base de datos de familia
     * @return fam = base de datos de familia
     */
    public familia[] getFam() {
        return fam;
    }

    /**
     * Metodo que nos devuelve la variable numPerro
     * @return numPerro = variable que nos ayuda a saber la cantidad de elementos en las bases de datos
     */
    public int getNumPerro() {
        return numPerro;
    }

    /**
     * Metodo que nos devuelve la variable numFamilia
     * @return numFamilia = variable que nos ayuda a saber la cantidad de elementos en las bases de datos
     */
    public int getNumFamilia() {
        return numFamilia;
    }
}