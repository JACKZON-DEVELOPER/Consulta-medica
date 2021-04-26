package UI;

import model.Doctor;
import model.Paciente;

import java.util.ArrayList;
import java.util.Scanner;
public class UIMenu {

    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo",
            "Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public static Doctor doctorLogged;
    public static Paciente pacienteLogeed;

    public static void showMenu(){

        int respuesta = 0;
        System.out.println("***********************************");
        System.out.println(" Bienbenido al Consultorio medico");
        System.out.println(" Por favor seleccione una opcion");
        System.out.println("***********************************");
        System.out.println(" ");
        do {
            System.out.println("%%%%%%%%%%%%%%%%%%");
            System.out.println(" 1.- Doctor");
            System.out.println(" 2.- Paciente");
            System.out.println(" 0.- Salir");
            System.out.println("%%%%%%%%%%%%%%%%%%");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta){
                case 1:
                    System.out.println("$$$$$$      Doctor      $$$$$$");
                    respuesta = 0;
                    authUser(1);
                    break;
                case 2:
                    System.out.println("$$$$$$      Paciente       $$$$$$");
                    respuesta = 0;
                    authUser(2);
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
            System.out.println(" model.Paciente");
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

    private static void authUser(int userType){
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejando Starlin", "alejandro@g.com"));
        doctors.add(new Doctor("Rpberto Gutierres", "robert@g.com"));
        doctors.add(new Doctor("Rocio Gomez", "rocio@g.com"));

        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Anaho Salgado", "anahi@g.com"));
        pacientes.add(new Paciente("Jasson Caamal", "jass@g.com"));
        pacientes.add(new Paciente("Armando Hernandez", "Armando@g.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("inserta tu correo: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect= true;
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }

                }

            }else if (userType == 2){
                for (Paciente p: pacientes){
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        pacienteLogeed = p;
                        UIPacienteMenu.showPacienteMenu();

                    }
                }
            }

        }while (!emailCorrect);

    }

}
