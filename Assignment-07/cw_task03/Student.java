package cw_task03;

public class Student {
    public String name;
    public double cgpa;
    public String department = "CSE";
    public static int id;

    public static int total_students = 0;
    public static int CSE_students = 0;
    public static int other_department = 0;

    public Student(String name,double cgpa){
        this.name = name;
        this.cgpa = cgpa;
        id++;
        total_students++;
        CSE_students++;
    }

    public Student(String name,double cgpa,String dept){
        this.name = name;
        this.cgpa = cgpa;
        department = dept;
        id++;
        total_students++;
        other_department++;
    }

    public void individualDetail(){
        System.out.println("ID : "+Student.id);
        System.out.println("Name: "+this.name);
        System.out.println("CGPA : "+this.cgpa);
        System.out.println("Department: "+this.department);
    }
    public static void printDetails(){
        System.out.println("Total Student(s): "+total_students);
        System.out.println("CSE Student(s): "+CSE_students);
        System.out.println("Other Department Student(s): "+other_department);
    }
}
