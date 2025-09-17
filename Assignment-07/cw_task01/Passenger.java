package cw_task01;

public class Passenger {
    
    public String name;
    public double weight;
    public double fare;
    public static int no_of_passenger;
    public static double total_fare;
    

    public Passenger(String name,double distance){
        this.name = name;
        this.fare = distance*20;
        total_fare += fare;
        no_of_passenger++;
    }
    public void storeBaggageWeight(double weight){
        this.fare +=(weight*10);
        double extra_fare = (weight*10);
        Passenger.total_fare+=extra_fare;

    }
    public void passengerDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Fare : "+this.fare+" Tk.");
    }
}
