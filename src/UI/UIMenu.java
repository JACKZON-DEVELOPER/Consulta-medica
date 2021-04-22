package UI;

import java.util.Scanner;
public class UIMenu {

    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo",
            "Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public static void showMenu(){

        int respuesta = 0;
        System.out.println("***********************************");
        System.out.println(" Bienbenido al Consultorio medico");
        System.out.println(" Por favor seleccione una opcion");
        System.out.println("***********************************");
        System.out.println(" ");
        do {
            System.out.println(" 1.- Doctor");
            System.out.println(" 2.- Paciente");
            System.out.println(" 0.- Salir");
            System.out.println(" ");
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            switch (respuesta){
                case 1:
                    System.out.println(" Doctor ");
                    break;
                case 2:
                    respuesta = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println(" Gracias por su visita ");
                    break;
                default:
                    System.out.println("Por favor selecione una opcion corecta");
            }
        }while (respuesta != 0);
    }
    static void showPatientMenu(){
        int respuesta = 0;
        do {
            System.out.println("\n\n");
            System.out.println(" Paciente");
            System.out.println(" 1.- Libro de Citas");
            System.out.println(" 2.- Mis Citas");
            System.out.println(" 3.- Regresar");
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            switch (respuesta) {
                case 1:
                    System.out.println("**libro de Citas ");
                    for (int i = 1; i < 4; i++) {
                        System.out.println( i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("**Mi Cita Medica");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("Por favor selecione una opcion corecta");
            }


        }while (respuesta != 0);

    }
}
