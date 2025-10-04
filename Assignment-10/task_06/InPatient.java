package task_06;

public class InPatient extends Patient{
    public String name;
    public String doctor;
    public String department;

    public static int admitted_here;

    public InPatient(String name,String doctor,String department){
        super(name, doctor);  //Ekhane abar all patient er counter +1 barbe
        this.department = department;
        System.out.println("New patient admitted in "+department);
        admitted_here++;
    }
    public String toString(){
        return super.toString()+"\nDepartment : "+department;
    }
    public static void details(){
        System.out.println("Total patients : "+Patient.total_patient);
        System.out.println("Admitted In-patients : "+admitted_here);
        System.out.println("Out Patients : "+ (total_patient-admitted_here));
    }
}
