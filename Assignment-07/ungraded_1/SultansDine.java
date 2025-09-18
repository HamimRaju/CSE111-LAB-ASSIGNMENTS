package ungraded_1;

public class SultansDine {
    public String branch_name;
    public int branch_sell;
    public static int total_branch;
    public static int total_sell;
    public static SultansDine[] branches = new SultansDine[100]; 

    public SultansDine(String branch_name){
        this.branch_name = branch_name;
        branches[total_branch] = this;
        total_branch++;
    }

    public void sellQuantity(int quantitiy){
        if(quantitiy < 10){
            this.branch_sell = quantitiy * 300;
            total_sell += branch_sell;
        }
        else if(quantitiy < 20){
            this.branch_sell = quantitiy * 350;
            total_sell += branch_sell;
        }
        else{
            this.branch_sell = quantitiy * 400;
            total_sell += branch_sell;
        }
    }

    public void branchInformation(){
        System.out.println("Branch Name: " + this.branch_name);
        System.out.println("Branch Sell: " + branch_sell + " Taka");
    }

    
    public static void details(){
        System.out.println("Total Number of branch(s): " + total_branch);
        System.out.println("Total Sell : " + total_sell + " Taka");

        if(total_branch == 0) {
            return;
        }

        for(int i = 0; i < total_branch; i++){
            SultansDine b = branches[i];
            System.out.println("Branch Name: " + b.branch_name + ", Branch Sell: " + b.branch_sell + " Taka");
            System.out.println("Branch consists of total sell's " +String.format("%.2f", (b.branch_sell * 100.0) / total_sell));
        }
    }
}