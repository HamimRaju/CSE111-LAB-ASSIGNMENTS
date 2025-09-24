package ungraded_01;

public class SignatureCard extends CreditCard{

    public SignatureCard(String name,String account_number){
        super(name, account_number, 200);
    }
    public void spendCash(int spend){
        System.out.println("Previous Reward Points : "+rewardPoints);
        int calculation = rewardPoints+(spend/100)*4;
        System.out.println("Rewards points after spending "+spend+" taka : "+calculation);
        rewardPoints = calculation;
    }
    public void cardDetails(){
        super.cardDetails();
        System.out.println("Possible Number of Companions for Lounge: 5");
    }
}
