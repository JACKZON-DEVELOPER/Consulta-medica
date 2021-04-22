public class Paciente {
    //atributos
    static int id = 0;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //constructor
    Paciente(String name, String email){
        id++;
        this.name=name;
        this.email=email;
    }
}
