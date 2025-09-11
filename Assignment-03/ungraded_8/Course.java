package ungraded_8;

public class Course {
    public String course_name;
    public String course_code;
    public String [] Course_Syllabus = new String[4];
    int count =0;

    public void addContent(String content){
        if(count<4){
            Course_Syllabus[count]=content;
            count++;
            System.out.println(content+" was added.");
        }
        else{
            System.out.println("Cannot add more content");
        }
    }
    public void addContent(String content1,String content2){
        if(count<4){
            Course_Syllabus[count]=content1;
            count++;
            System.out.println(content1+" was added.");
        }
        if(count<4){
            Course_Syllabus[count]=content2;
            count++;
            System.out.println(content2+" was added.");
        }
        else{
            System.out.println("Cannot add more content");
        }
    }
    public void updateDetails(String name,String code){
        course_name=name;
        course_code=code;
    }
    public void printDetails(){
        System.out.println("Course details : ");
        System.out.println("Course Name : "+course_name);
        System.out.println("Course Code:"+course_code);
        System.out.println("Course Syllabus : ");
        if(count==0){
            System.out.println("No content yet.");
        }
        else{
            for(int i=0;i<count;i++){
                System.out.println(Course_Syllabus[i]);
            }
        }
    }
}
