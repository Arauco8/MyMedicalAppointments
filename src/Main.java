import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Declarar el objeto ---- Instanciar el objeto
        Doctor myDoctor = new Doctor("Alejandro Rodríguez", "Pediatria");
        //System.out.println(myDocto);
        //System.out.println(myDoctor.speciality);

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient patient = new Patient("Maximiliano", "apumaleiva@gmail.com");
        patient.setWeight(100);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

        System.out.println(myDoctor);

        System.out.println(Doctor.Day.MONDAY);
        System.out.println(Doctor.Day.MONDAY.getSpanish());
        System.out.println(Doctor.Day.MONDAY.getFrench());

        for (int i = 0; i < Doctor.Day.values().length; i++) {
            System.out.println(Doctor.Day.values()[i].getSpanish()+ ","+ Doctor.Day.values()[i].getFrench());
        }

        System.out.println("\nAhora en distintos idiomas :D! y con ForEach\n");
        for (Doctor.Day doctor: Doctor.Day.values()) {
            System.out.println( doctor.getSpanish() +","+ doctor.getFrench());
        }

        //myDoctor.showName();
        //showMenu();
    }
}
