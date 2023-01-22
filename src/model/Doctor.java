package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos

    private String speciality;

    //Enumerations
    public static enum Day{
        SUNDAY("Domingo", "Dimanche"),
        MONDAY("Lunes", "Lundi"),
        TUESDAY("Martes", "Mardi"),
        WEDNESDAY("Miércoles", "Mercredi"),
        THURSDAY("Jueves", "Jeudi"),
        FRIDAY("Viernes", "Vendredi"),
        SATURDAY("Sábado", "Samedi");

        private String spanish;
        private String french;

        private Day(String s, String f){
            spanish = s;
            french = f;
        }

        public String getFrench() {
            return french;
        }

        public String getSpanish() {
            return spanish;
        }
    }
    // Método Constructor
    // Crea nueva instancias de una clase
    // tiene el mimsmo nombre de la clase que inicializa
    // usa la palabra reservada new para invocarlo
    public Doctor(String name, String email){
        super(name, email);
        // Instrucciones que se ejecutan al crear/instanciar
        // un nuevo objeto con la clase model.Doctor...
        System.out.println("El nombre del model.Doctor asignado es: " + name);
    }

    //Comportamientos


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSpeciality: " + speciality +
                "\nAvailable: " + availableAppointments.toString();
    }

    //Clase estatica anidada
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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
        @Override
        public String toString() {
            return "AvailableAppointment \nDate: " + date + "\nTime: " + time;
        }
    }

}
