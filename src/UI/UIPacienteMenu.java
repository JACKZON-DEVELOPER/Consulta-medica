package UI;

import java.util.Scanner;

public class UIPacienteMenu {
    public static void showPacienteMenu(){
        int respuesta = 0;
        do {
            System.out.println("\n\n");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Bienbenido señor" + UIMenu.pacienteLogeed.getName());
            System.out.println("sselecione una opcion");
            System.out.println(" 1. libro de citas ");
            System.out.println(" 2. mis citas  ");
            System.out.println(" 3. salir");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" ");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta){
                case 1:
                    //showAddAvalibelAppoitmenMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (respuesta != 0);
    }
    private static void showBookAppointmentMenu(){
        int respuesta = 0;
        do {
            System.out.println(":::::   Libro de citas  :::::");
            System.out.println(":::::   seleciona fecha  :::::");

        }while (respuesta != 0);
    }
}
