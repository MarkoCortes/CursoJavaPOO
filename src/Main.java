import java.util.Date;

import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
      //  showMenu();
        Doctor myDoctor = new Doctor("Marko Alan","Familiar");
        myDoctor.addAvailableAppointment(new Date(), "3 pm");
        myDoctor.addAvailableAppointment(new Date(), "4 pm");
        myDoctor.addAvailableAppointment(new Date(), "5 pm");
        
       // System.out.println(myDoctor.getAvailableAppointments());


        for (Doctor.AvailableAppointment aA:myDoctor.availableAppointments) {
            System.out.println(aA.getDate()+ " "+ aA.getTime());
        }
        //Patient paciente = new Patient("Marko", "marko@hotmail.com");
        //paciente.setPhoneNumber("123456789");
        //System.out.println(paciente.getPhoneNumber());


/*
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        Patient patient2 = new Patient("Anahi", "anahi@mail.com");


        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
 */
    }
}
