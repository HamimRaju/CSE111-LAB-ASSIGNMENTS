package task_05;
public class Course {
    String Course_name;
    String Course_code;
    int Course_credit;
    public void updateDetails(String name,String code,int credit){
        Course_name = name;
        Course_code = code;
        Course_credit = credit;

    }
    public void displayCourse(){
        System.out.println("Course Name: "+Course_name+"\nCourse Code : "+Course_code+"\nCourse Credit : "+Course_credit);
    }
}
