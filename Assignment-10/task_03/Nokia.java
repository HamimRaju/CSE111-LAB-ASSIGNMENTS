package task_03;

public class Nokia extends Mobile{

    public int balance ;

    public Nokia(String model,boolean sim_status,String imei,int balance){
        super(model,imei,sim_status);
        this.balance = balance;
    }

    public String toString(){
        return super.toString()+"\nBalance : "+(double)balance+" Tk.";
    }
    public void rechargeSIMCard(int amount){
        this.balance+=amount;
        System.out.println("Recharge successful! Current balance "+(double)balance+" TK.");
    }
    public String dialCall(String mobile_number){
        String countryCode = "";
        for(int i=0;i<3;i++){
            countryCode+=mobile_number.charAt(i);
        }
        String country_name = getCountryName(countryCode);
        
        if(simCardStatus==false){
            return "No SIM card available! Please check the SIM card connectivity.";
        }

        if(balance <=0){
            return "Insufficient balance! Please recharge.";
        }

        if(country_name == null){
            return "Dialing is not allowed in this region.";
        } 
         
        return "Dialing the number "+mobile_number+" to "+country_name+ " region";
    }
}
