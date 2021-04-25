package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();
    public static void showDoctorMenu(){
        int respuesta = 0;
        do {
            System.out.println("\n\n");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Bienbenido doctor " + UIMenu.doctorLogged.getName());
            System.out.println("sselecione una opcion");
            System.out.println(" 1. Agregar citas disponibles ");
            System.out.println(" 2. mis citas programadas ");
            System.out.println(" 3. salir");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(" ");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta){
                case 1:
                    showAddAvalibelAppoitmenMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (respuesta != 0);
    }
    private static void showAddAvalibelAppoitmenMenu(){
        int respuesta = 0;
        do {
            System.out.println(" ");
            System.out.println("::: agreaga una cita valida :::");
            System.out.println("::: Selecciona un mes :::");
            for (int i = 0; i < 3; i++) {
                int j = i+1;
                System.out.println(" "+j+". "+ UIMenu.MONTHS[i]);
            }
            System.out.println(" 0. Regresar");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            if (respuesta > 0 && respuesta < 4) {
                int monthSelected = respuesta;
                System.out.println(monthSelected+" . "+ UIMenu.MONTHS[monthSelected -1] );
                System.out.println("inserta la fecha disponible [dd/mm/yyyy]");
                String date = sc.nextLine();
                System.out.println("tu fecha: " + date + "es corecta?");
                System.out.println("\n 1. correcto \n 2. cambiar");

                int responDate = Integer.valueOf(sc.nextLine());
                if (responDate == 2) continue;

                int reponTime = 0;
                String time = "";
                do {
                    System.out.println("inserte la hora de la fecha "+ date +" [16:00]");
                    time = sc.nextLine();
                    System.out.println(" la hora es: " +time+ "\n 1. correcto \n 2. cambiar");
                    reponTime= Integer.valueOf(sc.nextLine());

                }while (reponTime == 2);
                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvalibleApoointments(UIMenu.doctorLogged);

            }else if (respuesta == 0){
                showDoctorMenu();
            }

        }while (respuesta != 0);
    }

    private  static void checkDoctorAvalibleApoointments(Doctor doctor){
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.add(doctor)){
            doctorsAvailableAppointments.add(doctor);

        }
    }
}
