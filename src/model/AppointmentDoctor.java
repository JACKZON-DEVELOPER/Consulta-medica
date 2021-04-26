package model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable{
    //Atributos
    private int id;
    private Paciente paciente;
    private Doctor doctor;
    private Date date;
    private String time;

    public AppointmentDoctor(Paciente paciente, Doctor doctor) {
        this.paciente = paciente;
        this.doctor = doctor;
    }

    // getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time + " hrs.";
    }

    public void setTime(String time) {
        this.time = time;
    }

    // uso del metodo de la interfaz ISchedulable
    @Override
    public void Shedule(Date date, String time) {
        this.date = date;
        this.time = time;

    }
}
