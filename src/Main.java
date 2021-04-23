import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor1 = new Doctor("Jasson","Cirujano");
        myDoctor1.addAvailableAppointment(new Date(), "01:00");
        myDoctor1.addAvailableAppointment(new Date(), "12:00");
        myDoctor1.addAvailableAppointment(new Date(), "15:30");
        for (Doctor.AvailableAppointment ap: myDoctor1.getAvailableAppointments()){
            System.out.println( ap.getDate()+" "+ ap.getTime());
        }

        Paciente paciente1 = new Paciente("alejandra","alejandra.mal.com");
        paciente1.setWeight(54.8);
        System.out.println(paciente1.getWeight());
        paciente1.setPhoneNumber("1234567890");
        System.out.println(paciente1.getPhoneNumber());

        //showMenu();
    }
}
