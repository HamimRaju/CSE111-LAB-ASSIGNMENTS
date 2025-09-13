package task_07;

public class BracuStudent {
    public String name;
    public String destination;
    public boolean entry = false;

    public BracuStudent(String name,String destination){
        this.name = name;
        this.destination = destination;
    }
    public void updateHome(String destination){
        this.destination = destination;
    }
    public void getPass(){
        entry = true;
    }
    public void showDetails(){
        System.out.println("Student Name : "+this.name);
        System.out.println("Lives in "+this.destination);
        System.out.println("Have Buss pass?"+entry);
    }
}
