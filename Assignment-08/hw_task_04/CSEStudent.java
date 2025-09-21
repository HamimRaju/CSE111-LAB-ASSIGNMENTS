package hw_task_04;

public class CSEStudent extends Student{

    public static String [] lab_course = {"CSE110", "CSE111", "CSE220","CSE221"};
    public static int cse_studentCount = 0;
    public CSEStudent(String name,int id){
        super(name, id);
    }
    public void addLabBasedCourse(String course_name){
        boolean found = false;
        for(int i=0;i<lab_course.length;i++){
            if(course_name.equals(lab_course[i])){
                super.courses+=course_name+" ";
                cse_studentCount++;
                found = true;
            }
        }
        if(!found){
            System.out.println("It is not a lab based course!");
        }
    }
    public static void details(){
        System.out.println("Total CSE Students: "+cse_studentCount);
        System.out.println("Available Lab Based Courses: ");
        for(int i=0;i<lab_course.length;i++){
            System.out.print(lab_course[i]+" ");
        }
        System.out.println();
    }
}
