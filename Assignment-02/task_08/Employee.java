package task_08;
public class Employee {
    String name;
    double salary;
    String designation;

    public void newEmployee(String employee_name){
        name = employee_name;
        salary = 30000;
        designation = "junior";
    }

    public void promoteEmployee(String promotion){
        designation = promotion;
        System.out.println(name+" has been promoted to "+designation);
        if(designation.equals("senior")){
            salary+=25000;
            System.out.println("New salary : "+salary);
        }
        else if(designation.equals("lead")){
            salary+=50000;
            System.out.println("New salary : "+salary);
        }
        else if(designation.equals("manager")){
            salary+=75000;
            System.out.println("New salary : "+salary);
        }
    }

    public void calculateTax(){
        if(salary>30000 && salary<=50000){
            double tax = salary*(10.0/100);
            System.out.println(name+" Tax amount : "+tax+" Tk.");
        }
        else if(salary>50000){
            double tax = salary*(30.0/100);
            System.out.println(name+" Tax amount : "+tax+" Tk.");
        }
        else{
            System.out.println("No need to pay tax.");
        }
    }

    public void displayInfo(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Salary : "+salary+" Tk.");
        System.out.println("Employee Designation : "+designation);
    }
}