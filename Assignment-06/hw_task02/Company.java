package hw_task02;

public class Company {
    
    public String company_name = "ABC Company";
    public int employee_count = 0;
    public Employee [] all_employees = new Employee[3];

    public void addEmployee(Employee employee){
        if(employee_count<all_employees.length){
            all_employees[employee_count] = employee;
            employee_count++;
            System.out.println(employee.getName()+" has joned the company.");
        }
        else{
            System.out.println("No more vacancy");
        }
    }

    public void removeEmployee(Employee employee){
        for(int i=0;i<employee_count;i++){
            if(all_employees[i]==employee){
                System.out.println(employee.getName()+" has left the company");
    
                for (int j = i; j < employee_count - 1; j++) {
                    all_employees[j] = all_employees[j + 1];
                }
                all_employees[employee_count - 1] = null;
                employee_count--;
                return;
            }
        }
    }

    public void details(){
        System.out.println("Company Name : "+company_name);
        System.out.println("Total Employee : "+employee_count);
        System.out.println("Fulltime Employees : ");
        for (int i = 0; i < employee_count; i++) {
            if (all_employees[i].getRole().equals("Fulltime")) {
                System.out.println(all_employees[i]);
            }
        }
        System.out.println("Part-Time Employees: ");
        for (int i = 0; i < employee_count; i++) {
            if (all_employees[i].getRole().equals("Part-time")) {
                System.out.println(all_employees[i]);
            }
        }
    }
}
