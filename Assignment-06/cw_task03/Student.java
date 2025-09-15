package cw_task03;

public class Student {

    public String email = null;
    private String password = null;
    private String login_status = null;

    public String name;
    public int id;
    public String department;

    public String [] courses_taken = new String [3];
    public int course_count = 0;

    public Student(String name,int id,String dept){
        this.name = name;
        this.id = id;
        this.department = dept;
        System.out.println("Student object is created");
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public String getLoginStatus(){
        return login_status;
    }
}