package cw_task02;

public class BracuStudent {
    public String name;
    private String destination;
    public boolean entry = false;

    public BracuStudent(String name,String destination){
        this.name = name;
        this.destination = destination;
    }
    public void setLocation(String destination){
        this.destination = destination;
    }
    public String getLocation(){
        return destination;
    }
    public void collectPass(){
        entry = true;
    }
    public void showDetails(){
        System.out.println("Student Name : "+this.name);
        System.out.println("Lives in "+this.destination);
        System.out.println("Have Buss pass?"+entry);
    }
}
