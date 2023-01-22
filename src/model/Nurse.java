package model;

public class Nurse extends User{
    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
        System.out.println("El nombre de la Enfermera asignada es: " + name);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSpeciality: " + speciality;

    }
}
