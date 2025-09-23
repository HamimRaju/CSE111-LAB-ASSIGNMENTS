package hw_task01;


public class Manager extends Employee{
    public int bonus;
    public double final_salary;
    public Manager(String name,int base_salary,int working_hours,int bonus){
        super(name, base_salary, working_hours);
        this.bonus = bonus;
    }
    public void calculateSalary(){
        if(super.getHoursWorked()>40){
            final_salary = getBaseSalary() + (getBaseSalary() * bonus / 100.0);
        }
        else{
            setBaseSalary(getBaseSalary());
        }
    }
    public void requestIncrement(int amount){
        if(super.getHoursWorked()>100){
            setBaseSalary(getBaseSalary()+amount);
            System.out.println("$" + amount+" Increment approved.");
        }
        else if(super.getHoursWorked()>80 && super.getHoursWorked()<100){
            int half =amount/2;
            setBaseSalary(getBaseSalary()+half);
            System.out.println("$" + amount/2 + " Increment approved.");
        }
        else{
            System.out.println("Increment denied.");
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus : "+(double)bonus+" %");
        System.out.println("Final Salary : "+final_salary);
    }
}
