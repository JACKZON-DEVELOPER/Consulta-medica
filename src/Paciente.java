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


//    getters and setters

    public String getWeight(){
        return this.weight + " kg.";
    }
    public void setWeight(double weight){
        this.weight=weight;
    }

    public String getHeight() {
        return height +" M.";
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Paciente.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 10) {
            System.out.println("El numero telefonico debe ser de 10 digitos");
        } else if (phoneNumber.length()== 10){
            this.phoneNumber=phoneNumber;
        }
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }
}
