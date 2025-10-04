package task_06;

public class Patient {
    public String name;
    public String doctor;
    public String department;
    public int id;
    public static int total_patient = 0;

    public Patient(String name,String doctor){
        this.doctor = doctor;
        this.name = name;
        total_patient++;
        this.id = total_patient;
    }
    
    public String toString(){
        return "Patient ID : P0"+id+", Name : "+name+"\nDoctor : "+doctor;
    }
    public static void details(){
        System.out.println("Total patients : "+total_patient);
    }
    public static void details(Patient [] all_patients){
        System.out.println("Details of "+all_patients.length+" selected patients : ");
        
        for(int i=0;i<all_patients.length;i++){
            System.out.println("== == == == ==");
            System.out.println(all_patients[i].toString()); //toString na dileo automatically call hoto
        }
    }
}
