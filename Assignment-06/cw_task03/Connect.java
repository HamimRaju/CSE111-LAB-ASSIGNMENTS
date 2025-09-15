package cw_task03;

public class Connect {

    public Student [] all_advisee = new Student[5];
    public int advisee_count=0;

    public Connect(){
        System.out.println("Connect is ready to use!");
    }

    public void login(Student obj){
        if(obj.email==null && obj.getPassword()==null){
            System.out.println("Email and password need to be set.");
        }
        else{
            System.out.println("Login successful");
        }
    }

    public void advising(Student obj){
        if(obj.email==null && obj.getPassword()==null){
            System.out.println("Please login to advise courses!");
            return;
        }
        if(obj.course_count==0){
            System.out.println("You haven't selected any courses.");
            return;
        }
        else if(obj.course_count>3){
            System.out.println("You need special approval to take more than 3 courses.");
        }
        else if(advisee_count<5){
            all_advisee[advisee_count] = obj;
            advisee_count++;
            System.out.println("Advising successful!");
        }
        
    }
    
    public void advising(Student obj,String course1,String course2,String course3){
        if(advisee_count<5){
            all_advisee[advisee_count] = obj;
            advisee_count++;
            System.out.println("Advising successful!");
        }
        if(obj.course_count<3){
            obj.courses_taken[obj.course_count] = course1;
            obj.course_count++;
            if(obj.course_count<3){
                obj.courses_taken[obj.course_count] = course2;
                obj.course_count++;
            }
            if(obj.course_count<3){
                obj.courses_taken[obj.course_count] = course3;
                obj.course_count++;
            }
        }
    }

    public void advising(Student obj,String course1,String course2,String course3,String course4){
        System.out.println("You need special approval to take more than 3 courses.");
    }

    public void allAdviseeInfo(){
        System.out.println("Total Advisee : "+advisee_count);
        for(int i=0;i<advisee_count;i++){
            System.out.println("Name : "+all_advisee[i].name+" ID : "+all_advisee[i].id+"\nDepartment : "+all_advisee[i].department);
            System.out.println("Advised Courses : ");
            for(int j=0;j<3;j++){
                System.out.print(all_advisee[i].courses_taken[j]+" ");
            }
            System.out.println("\n==============");
        }
        
    }
}