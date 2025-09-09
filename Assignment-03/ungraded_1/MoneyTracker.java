package ungraded_1;

public class MoneyTracker {
    public String name;
    public double balance;
    public double last_added;
    public double last_spent;

    public String info(){
        return "Name: "+name+"\nCurrent Balance: "+balance;
    }
    public void createTracker(String name){
        this.name=name;
        this.balance=1.0;
    }
    public void income(int income){
        this.last_added=income;
        System.out.println("Balance Updated!");
        balance+=income;
        
    }
    public void expense(int expense){
        if(expense<balance){
            this.last_spent=expense;
            System.out.println("Balance updated!");
            balance-=expense;
        }
        else{
            if(balance==0){
                System.out.println("You are broke!");
            }
            else{
                System.out.println("Not enough balance.");
            }
        }
        
    }
    public void showHistory(){
        System.out.println("Last added: "+last_added);
        System.out.println("Last spent: "+last_spent);
    }
}
