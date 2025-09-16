package hw_task03;

public class Department {

    public String department;
    public Student [ ]info = new Student[5];
    public int count = 0; 

    public Department(String dept){
        department = dept;
    }

    public void addStudent(Student s){
        for (int i = 0; i < count; i++) {
            if (info[i].id == s.id) {
                System.out.println("Student with the same ID already exists, Please try with another ID");
                return;
            }
        }
        if(count<info.length){
            info[count]=s;
            count++;
            System.out.println("Welcome to CSE department, "+s.name);
        }
    }

    public void addStudent(Student s1,Student s2,Student s3){
        if(count<info.length){
            info[count]=s1;
            count++;
            System.out.println("Welcome to CSE department, "+s1.name);
            info[count]=s2;
            count++;
            System.out.println("Welcome to CSE department, "+s2.name);
            info[count]=s3;
            count++;
            System.out.println("Welcome to CSE department, "+s3.name);
        }
    }

    public void findStudent(int number){
        if(number>0){
            for(int i=0;i<count;i++){
                if(number==info[i].id){
                    System.out.println("Student info : ");
                    System.out.println("Student Name : "+info[i].name);
                    System.out.println("ID : "+info[i].id);
                    System.out.println("CGPA : "+info[i].cgpa);
                }
            }
        }
        else{
            System.out.println("Student with this ID doesn't exist, Please give a valid ID");
        }
    }

    public void details(){
        System.out.println("Department Name : "+department);
        System.out.println("Number of student : "+count);
        System.out.println("Details of the students : ");
        for(int i=0;i<count;i++){
            System.out.println("Student name : "+info[i].name+" , ID : "+info[i].id+" , cgpa : "+info[i].cgpa);
        }
    }
}
