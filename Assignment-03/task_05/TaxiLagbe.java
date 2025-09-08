package task_05;

public class TaxiLagbe {

    public String taxi_number;
    public String route ;
    public String [] passenger_list = new String[4];
    public int count = 0;
    public int total_fare=0;

    public void storeInfo(String taxi_number,String route){
        this.taxi_number=taxi_number;
        this.route=route;
    }

    public void addPassenger (String name,int fare){
        if(count<passenger_list.length){
            passenger_list[count]=name;
            count++;
            System.out.println("Dear "+name+"! Welcome to TaxiLagbe");
            total_fare+=fare;
        }
        else{
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    public void addPassenger(String name,int fare,String name2,int fare2){
        if(count<passenger_list.length){
            passenger_list[count]=name;
            count++;
            System.out.println("Dear "+name+"! Welcome to TaxiLagbe");
            total_fare+=fare;
            
        }
        if(count<passenger_list.length){
            passenger_list[count]=name2;
            count++;
            System.out.println("Dear "+name2+"! Welcome to TaxiLagbe");
            total_fare+=fare2;
        }   
        else{
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    public void printDetails(){
        System.out.println("Taxi Number : "+taxi_number);
        System.out.println("This taxi can cover : "+route+" area.");
        System.out.println("Total passenger : "+count);
        System.out.println("Passenger list : ");
        for(int i=0;i<count;i++){
            System.out.print(passenger_list[i]+" ");
        }
        System.out.println("\nTotal collected fare : "+total_fare);
    }
}
