package model;

public class Nurse extends User{
    //atributos
    private String speciality;

    //metodo constructor
    public Nurse(String name, String email) {
        super(name, email);
    }

    // metodo heredado de la calse user
    @Override
    public void showDataUer() {
        System.out.println("hospital cruz roja");
        System.out.println("departamentp canserologioa");
    }

    //getters y setters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


}
