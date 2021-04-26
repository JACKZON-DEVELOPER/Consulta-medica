package model;

import java.util.ArrayList;
import java.util.Date;

public class Paciente extends User{
    //atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;


    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.Shedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    //metodo constructor
    public Paciente(String name, String email){
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

    // metodo toString
    @Override
    public String toString() {
        return super.toString() +
                "birthday='" + birthday + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", blood='" + blood + '\'' +
                '}';
    }

    // Metodo heredado de la calse User
    @Override
    public void showDataUer() {
        System.out.println("paciente ");
        System.out.println(" historela copleto ");
    }

}
