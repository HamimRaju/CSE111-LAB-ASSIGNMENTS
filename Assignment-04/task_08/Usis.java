package task_08;

public class Usis {
    Student[] adviseeList = new Student[100];
    int adviseeCount = 0;

    public Usis(){
        System.out.println("Usis is ready to use!");
    }

    public void advising(Student student){
        if(student.count == 0){
            System.out.println("You haven't selected any courses.");
        }
        else{
            System.out.println("Please login to advise courses!");
        }
    }

    public void login(Student student){
        if(student.email == null && student.password == null){
            System.out.println("Email and password need to be set.");
        }
        else{
            student.login_status = "Logged in";
            System.out.println("Login successful");
        }
    }

    public void advising(Student student,String course1,String course2,String course3){
        if(student.count < 3){
            if(student.count < 3){
                student.all_courses[student.count] = course1;
                student.count++;
            }
            if(student.count < 3){
                student.all_courses[student.count] = course2;
                student.count++;
            }
            if(student.count < 3){
                student.all_courses[student.count] = course3;
                student.count++;
            }
            System.out.println("Advising successful!");
            addStudent(student);
        }
        else{
            System.out.println("You need special approval to take more than 3 courses.");
        }
    }

    public void advising(Student student,String course1,String course2,String course3,String course4){
        // trying to take 4 courses → directly reject like your output
        System.out.println("You need special approval to take more than 3 courses.");
    }

    private void addStudent(Student student){
        boolean alreadyAdded = false;
        for(int i=0; i<adviseeCount; i++){
            if(adviseeList[i] == student){
                alreadyAdded = true;
                break;
            }
        }
        if(!alreadyAdded){
            adviseeList[adviseeCount] = student;
            adviseeCount++;
        }
    }

    public void allAdviseeInfo(){
        System.out.println("Total Advisee: " + adviseeCount);
        for(int i=0; i<adviseeCount; i++){
            Student s = adviseeList[i];
            System.out.println("Name: " + s.name + " ID: " + s.id);
            System.out.println("Department: " + s.department);
            System.out.print("Advised Courses: \n");
            for(int j=0; j<s.count; j++){
                System.out.print(s.all_courses[j] + " ");
            }
            System.out.println("\n==============");
        }
    }
}