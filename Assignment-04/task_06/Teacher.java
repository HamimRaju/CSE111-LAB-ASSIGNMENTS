package task_06;

public class Teacher {
    public String name;
    public String initial;
    String [] all_courses = new String[3];
    int count =0;

    public Teacher(String name,String initial){
        System.out.println("A new Teacher has been created.");
        this.name = name;
        this.initial = initial;
    }
    public void addCourse(Course location){
        all_courses[count] = location.course_name;
        count++;
    }
    public void printDetail(){
        System.out.println("Name : "+this.name);
        System.out.println("Initial : "+this.initial);
        System.out.println("List of courses : ");
        for(int i=0;i<count;i++){
            System.out.println(all_courses[i]);
        }
    }
}
