public class Controlador {
    public static void main(String[] args) {
        Sistema system = new Sistema();
        Vista vis = new Vista();
        int opcion = 0;
        boolean max = false;
        String[] datosFam1 = {"Martinez", "4", "0", "0", "0"};
        String[] datosFam2 = {"Canales", "6", "2", "1", "2"};
        String[] datosFam3 = {"Valladares", "2", "0", "0", "1"};
        String[] datosDog1 = {"pequeño", "mestizo", "4", "50", "cafe", "Polo"};
        String[] datosDog2 = {"mediano", "Pit bull terrier", "10", "60", "negro", "Pablo"};
        String[] datosDog3 = {"grande", "Tosa Inu", "8", "70", "negro", "Catty"};
        
        system.nuevaFamilia(datosFam1);
        system.nuevaFamilia(datosFam2);
        system.nuevaFamilia(datosFam3);
        system.nuevoPerro(datosDog1);
        system.nuevoPerro(datosDog2);
        system.nuevoPerro(datosDog3);

        vis.bienvenida();

        while (opcion != 6){

            opcion = vis.pedirOpcion();
            if (opcion == 1) {
                String[] datos = vis.pedirDatosFamilia();
                max = system.nuevaFamilia(datos);
                if (max == true){
                    vis.Cupo();
                }
                else{
                    vis.noCupo();
                }
            }
            else if (opcion == 2){
                String[] datos = vis.pedirDatosCanino();
                max = system.nuevoPerro(datos);
                if (max == true){
                    vis.Cupo();
                }
                else{
                    vis.noCupo();
                }
            }
            else if (opcion == 3){
                vis.printCan(system.getDog(), system.getNumPerro());
                boolean asignado = system.asignarCan(vis.perroACambiar());
                if (asignado == true){
                    vis.asignado();
                }
                else{
                    vis.perrera();
                }
            }
            else if (opcion == 4){
                vis.printFam(system.getFam(), system.getNumFamilia());
            }
            else if (opcion == 5){
                vis.printCan(system.getDog(), system.getNumPerro());
            }
            else if (opcion == 6){
                System.exit(0);
            }
            else{
                System.out.println("Ingrese una opcion valida");
            }
        }
    }
}