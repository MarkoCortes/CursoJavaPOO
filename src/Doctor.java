import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0;
    private String name;
    private String email;
    private String speciality;
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }
    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor es "+ name);
        this.name = name;
        this.speciality=speciality;
    }

    //Comportamiento
    public void showName(){
        System.out.println(this.name);
    }
    public void showId(){
        System.out.println("ID Doctor: "+ this.id);

    }


    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return  this.availableAppointments;
    }

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
    }
}
