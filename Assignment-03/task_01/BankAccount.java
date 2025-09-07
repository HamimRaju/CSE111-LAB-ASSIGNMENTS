package task_01;
public class BankAccount {
    int account_number;
    String account_type="Not Set";
    public void setInfo (int no,String type){
        System.out.println("Account information updated.");
        account_number = no;
        account_type=type;
    }
    public String printDetails(){
        return "Account No: "+account_number+"\nType : "+account_type;
    }
}
