import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //Doctor myDosctor = new Doctor("pablo");
        Doctor myDosctor = new Doctor();
        myDosctor.name= "Jassso";
        //myDosctor.showName();
        //myDosctor.showId();
        System.out.println("**************");
        Doctor otroDoctor = new Doctor();
        //otroDoctor.showId();
        showMenu();
    }
}
