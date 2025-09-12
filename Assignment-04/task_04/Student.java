package task_04;

public class Student {
    public int id;
    public double cgpa;
    String [] all_courses = new String[4];
    int count = 0;

    public Student(int id){
        this.id = id;
        System.out.println("A student with ID "+id+" has been created.");
    }
    public Student(int id,double cgpa){
        this.id = id;
        this.cgpa = cgpa;
        System.out.println("A student with ID "+id+" , CGPA: "+this.cgpa+" has been created.");
    }
    public void storeID(int id){
        this.id = id;
    }
    public void storeCG(double cgpa){
        this.cgpa = cgpa;
    }
    //For adding single course
    public void addCourse(String  course_name){
        if(cgpa<=0){
            System.out.println("Failed to add "+course_name+"\nSet CG first.");
        }
        else if(cgpa<3 && count>=3){
            System.out.println("Failed to add "+course_name);
            System.out.println("CG is low. Can't add more than 3 courses.");
            
        }
        else if(count>=4){
            System.out.println("Failed to add "+course_name);
            System.out.println("Maximum 4 courses allowed.");
            
        }
        //If all conditions pass then it will add
        else{
            all_courses[count]=course_name;
            count++;
        }       
    }
    //For adding multiple courses.
    public void addCourse(String [] courses){
        if(courses.length<=4){
            for(int i=0; i<courses.length; i++){
                all_courses[i]=courses[i];
                count++;
            }
        }
        else{
            if(courses.length>4){
                for(int i=0;i<4; i++){
                    all_courses[i]=courses[i];
                    count++;
                }
            }
            System.out.println("Failed to add "+courses[courses.length-1]+"\nMaximum 4 courses allowed.");
        }
    }
    public void removeAllCourse(){
        count=0;
        all_courses= new String[4];
    }
    public void showAdvisee(){
        System.out.println("Student ID : "+this.id+" , "+" CGPA : "+this.cgpa);
        if(count>0){
            System.out.println("Added courses are : ");
            for(int i=0;i<count;i++){
                System.out.print(all_courses[i]+" ");
            }
             System.out.println();
        }
         else{
            System.out.println("No courses added.");
        }
    }
}
