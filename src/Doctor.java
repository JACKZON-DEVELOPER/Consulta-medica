public class Doctor {

    //atributos
    static int id = 0;
    String name;
    String speciality;

    //comportamiento
    Doctor(){
        System.out.println("construyendo el metodo doctor");
        id++;
    }
    Doctor(String name){
        System.out.println("el nombre del doctor es: " + name);
    }
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID= "+ id);
    }
}
