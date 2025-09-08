package task_06;

public class Student {
    public String name="Not set";
    public String department="CSE";
    public double cgpa;
    public int credit;
    public String Scholarship_Status="Not set";
    
    public void updateDetails(String name,double cgpa){
        this.name=name;        
        this.cgpa=cgpa;
    }
    public void updateDetails(String name,double cgpa,int credit){
        this.name=name;        
        this.cgpa=cgpa;
        this.credit=credit;
    }
    public void updateDetails(String name,double cgpa,int credit,String dept){
        this.name=name;        
        this.cgpa=cgpa;
        this.credit=credit;
        department=dept;
    }
    public void checkScholarshipEligibility(){
        if(cgpa>=3.5 && credit>=10){
            if(cgpa>=3.5 && cgpa <3.7){
                Scholarship_Status="Need based";
                System.out.println(name+ " is eligible for Need-based scholarship.");
            }
            else if(cgpa >=3.7){
                Scholarship_Status="Merit based";
                System.out.println(name+" is eligible for Merit based scholarship.");
            }
        }
        else{
            Scholarship_Status="No Scholarship";
            System.out.println(name+" is not eligible for scholarship");
        }
    }
    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Department : "+department);
        System.out.println("CGPA : "+cgpa);
        System.out.println("Credits : "+credit);
        System.out.println("Scholarship Status : "+Scholarship_Status);
    }
}
