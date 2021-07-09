public class Doctor {
    static int id = 0;
    String name;
    String speciality;

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

}
