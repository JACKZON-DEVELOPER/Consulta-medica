package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    //atributos
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //metodo constructor con herencia de user
    public Doctor(String name, String email){
        super(name, email);
    }

    //getters y setters
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //esto es una coleccion de objetos

    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    //sobreescribiendo el metodo toString
    @Override
    public String toString() {
        return super.toString() +
                "\n Especialida: "+ speciality +
                "\n :::::::: "+ availableAppointments.toString() + ":::::::";
    }

    //metodo abstracto heredado de la clase user
    @Override
    public void showDataUer() {
        System.out.println("hospital general de valladolid urgencia");
    }

    // clase statica anidada para la coleccion de datos
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/dddd");
        //constructor
        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        //getters y setters
        public Date getDate(String DATE) {
            return date;
        }
        public String getDate(){
            return format.format(date);
        }
        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointment:  " +
                    "\n date= " + date +
                    ", time= " + time ;
        }
    }
}