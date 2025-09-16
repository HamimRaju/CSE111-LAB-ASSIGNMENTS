package hw_task02;

public class Employee {

    private String name;
    private int id;
    private String role;

    public Employee(){
        System.out.println("A default employee has been created.");
    }

    public Employee(String name,int id,String role){
        this.name = name;
        this.id = id;
        this.role = role;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public String getRole(){
        return role;
    }
    public String toString(){
        return "Name : "+name+", ID : "+id;
    }
}
