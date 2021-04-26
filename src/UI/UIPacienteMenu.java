package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
                    showBookAppointmentMenu();
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
            //
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println( k+". "+ availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int respoDateSelect = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvalibleSelected = doctors.get(respoDateSelect);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");
            for (Map.Entry<Integer, Doctor> doc : doctorAvalibleSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();

            }

            System.out.println(doctorSelected.getName()+ " . Fecha: "
                    + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +" "
                    + doctorSelected.getAvailableAppointments().get(indexDate).getTime()
            );
            System.out.println("Es correcto tu cita?  \n 1. Si \n 2. No");
            respuesta = Integer.valueOf(sc.nextLine());
            if (respuesta == 1) {
                UIMenu.pacienteLogeed.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());
                showPacienteMenu();
            }

        }while (respuesta != 0);
    }

    private static void showPatientMyAppointment(){
        int respuesta = 0;
        do {
            System.out.println("!!!!!   Mis Citas   !!!!!");
            if (UIMenu.pacienteLogeed.getAppointmentDoctors().size() == 0){
                System.out.println("no tienes Citas ajendadas");
                break;
            }
            for (int i = 0; i < UIMenu.pacienteLogeed.getAppointmentDoctors().size(); i++) {
                int j = i +1;
                System.out.println(j+".  la fecha "+
                        UIMenu.pacienteLogeed.getAppointmentDoctors().get(i).getDate() + " a las " +
                        UIMenu.pacienteLogeed.getAppointmentDoctors().get(i).getTime() + " \n con el Doctor "+
                        UIMenu.pacienteLogeed.getAppointmentDoctors().get(i).getDoctor().getName()
                );
            }
            System.out.println("0. Salir ");

        }while (respuesta != 0);
    }
}
