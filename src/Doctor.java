public class Doctor {

    //atributos
    static int id = 0;
    String name;
    String speciality;

    //comportamiento
    Doctor(){

    }
    Doctor(String name, String speciality){
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID= "+ id);
    }
}