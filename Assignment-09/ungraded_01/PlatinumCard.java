package ungraded_01;

public class PlatinumCard extends CreditCard{

    public PlatinumCard(String name,String account_number){
        super(name, account_number,100);
    }
    public void spendCash(int spend){
        System.out.println("Previous Reward Points : "+rewardPoints);
        int calculation = rewardPoints+(spend/100)*2;
        System.out.println("Rewards points after spending "+spend+" taka : "+calculation);
        rewardPoints = calculation;
    }
}
