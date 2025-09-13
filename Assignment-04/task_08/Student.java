package task_08;

public class Student {
    public String name;
    public int id;
    public String department;

    public String email = null;
    public String password = null;
    public String login_status = null;
    
    String [] all_courses = new String[3];
    public int count = 0;
    
    public Student(String name,int id,String department){
        this.name = name;
        this. id = id;
        this.department = department;
        System.out.println("Student object is created");     
    }
}
