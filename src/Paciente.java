public class Paciente extends User{
    //atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //constructor
    Paciente(String name, String email){
        super(name, email);
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

    @Override
    public String toString() {
        return super.toString() +
                "birthday='" + birthday + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", blood='" + blood + '\'' +
                '}';
    }
}
