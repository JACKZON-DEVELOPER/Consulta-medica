import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    //atributos
    static int id = 0;
    private String name;
    private String email;
    private String speciality;

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

    //esto es una coleccion de objetos
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));

    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

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
    }
}