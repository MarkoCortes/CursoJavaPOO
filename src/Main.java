import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {
      //  showMenu();
        Doctor myDoctor = new Doctor("Marko Alan","Familiar");


        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        Patient patient2 = new Patient("Anahi", "anahi@mail.com");


        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
    }
}
