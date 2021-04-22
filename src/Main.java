import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor1 = new Doctor("Jasson","Cirujano");
        System.out.println(myDoctor1.name);
        System.out.println(myDoctor1.speciality);

        Paciente paciente1 = new Paciente("alejandra","alejandra.mal.com");
        paciente1.setWeight(54.8);
        System.out.println(paciente1.getWeight());
        paciente1.setPhoneNumber("1234567890");
        System.out.println(paciente1.getPhoneNumber());

        //showMenu();
    }
}
