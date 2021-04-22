import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor1 = new Doctor("Jasson","Cirujano");
        System.out.println(myDoctor1.name);
        System.out.println(myDoctor1.speciality);

        Paciente paciente1 = new Paciente("alejandra","alejandra.mal.com");

        //showMenu();
    }
}
