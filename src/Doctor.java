public class Doctor {

    //atributos
    int id;
    String name;
    String speciality;

    //comportamiento
    Doctor(){
        System.out.println("construyendo el metodo doctor");
    }
    Doctor(String name){
        System.out.println("el nombre del doctor es: " + name);
    }
    public void showName(){
        System.out.println(name);
    }
}
