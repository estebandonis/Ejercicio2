public class Sistema {
    private familia[] fam = new familia[15];
    private perro[] dog = new perro[30];
    private int numFamilia;
    private int numPerro;
    private boolean seAgrego;
    public String[] perrosPeligrosos = {"Pit bull terrier", "American Staffordshire terrier", "Tosa Inu", "Dogo argentino", "Dogo Guatemalteco", "Fila brasileño", "Presa canario", "Dóberman", "Gran perro japonés", "Mastín napolitano", "Presa Mallorqui", "Dogo de burdeos", "Bullmastiff", "Bull terrier inglés", "Bulldog americano", "Rhodesiano", "Rottweiler"};
    private boolean asignado;

    Sistema(){
        numFamilia = 0;
        numPerro = 0;
        asignado = false;
    }

    public boolean nuevaFamilia(String[] datos){
        if (numFamilia < 15){
            String apellido = datos[0];
            String cantidadMiembros = datos[1];
            String cantidadKidsMenor10 = datos[2];
            String cantidadKidsMayor10 = datos[3];
            String cantidadMascotas = datos[4];
            familia nuevaFam = new familia(apellido, cantidadMiembros, cantidadKidsMenor10, cantidadKidsMayor10, cantidadMascotas);
            fam[numFamilia] = nuevaFam;
            numFamilia += 1;
            seAgrego = true;
        }
        else{
            seAgrego = false;
        }
        return seAgrego;
    }

    public boolean nuevoPerro(String[] datos){
        if (numPerro < 30){
            String size = datos[0];
            String raza = datos[1];
            String edadAproximada = datos[2];
            String nivelSalud = datos[3];
            String color = datos[4];
            String nombre = datos[5];
            perro nuevoDog = new perro(size, raza, edadAproximada, nivelSalud, color, nombre);
            dog[numPerro] = nuevoDog;
            numPerro += 1;
            seAgrego = true;
        }
        else{
            seAgrego = false;
        }
        return seAgrego;
    }

    public boolean asignarCan(int fila){
        String size = dog[fila].getSize();
        String raza = dog[fila].getRaza();
        for (int a = 0; a < 17; a++){
            if (raza == perrosPeligrosos[a]){
                for (int k = 0; k < 15; k++){
                    if (fam[k].getCantidadMascotas() < 4){
                        if (fam[k].getcantidadKidsMenor10() == 0 && fam[k].getCantidadKidsMayor10() == 0){
                            int cantMascotas = fam[k].getCantidadMascotas();
                            cantMascotas += 1;
                            fam[k].setCantidadMascotas(cantMascotas);
                            asignado = true;
                        }
                        break;
                    }
                }
                break;
            }
        }
        if (asignado == false){
            if (size == "pequeño"){
                for (int i = 0; i < 15; i++){
                    int cantMascotas = fam[i].getCantidadMascotas();
                    if (cantMascotas < 4){
                        cantMascotas += 1;
                        fam[i].setCantidadMascotas(cantMascotas);
                        asignado = true;
                        break;    
                    }
                }
            }
            else if (size == "mediano"){
                for (int o = 0; o < 15; o++){
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
            else if (size == "grande"){
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

    public perro[] getDog() {
        return dog;
    }

    public familia[] getFam() {
        return fam;
    }

    public int getNumPerro() {
        return numPerro;
    }

    public int getNumFamilia() {
        return numFamilia;
    }
}