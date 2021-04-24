package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    //atributos
    private String speciality;

    //comportamiento
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
    //
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Especialida: "+ speciality +
                "\n :::::::: "+ availableAppointments.toString() + ":::::::";
    }

    // clase statica anidada para la coleccion de datos
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        //constructor
        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        //getters y setters
        public Date getDate() {
            return date;
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