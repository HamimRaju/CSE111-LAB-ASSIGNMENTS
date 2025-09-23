package hw_task01;

public class Developer extends Employee{
    public String language;
    public double final_salary;

    public Developer(String name,int base_salary,int working_hours,String language){
        super(name, base_salary, working_hours);
        this.language = language;
    }
    public void calculateSalary(){
        if(language.equals("Java")){
            final_salary = getBaseSalary()+700;
        }
        else{
            final_salary = getBaseSalary();
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language : "+language);
        System.out.println("Final Salary : $"+final_salary);
    }
}
