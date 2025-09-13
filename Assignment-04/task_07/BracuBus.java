package task_07;

public class BracuBus {
    public String route;
    public int passenger_count=2;
    public String [] passenger_name = new String[2];
    public int count;

    public BracuBus(String route){
        this.route=route;
    }
    public BracuBus(String route,int passenger){
        this.route=route;
        passenger_count=passenger;
    }
    public void board(){
        System.out.println("No passengers");
    }
    public void board(BracuStudent student){
        if(!student.entry){
            System.out.println("You don't have a bus pass!");
        }
        else if(!student.destination.equals(route)){
            System.out.println("You got on the wrong bus!");
        }
        else if(count>=passenger_count){
            System.out.println("Bus is Full!");
        }
        else{
            passenger_name[count]=student.name;
            count++;
            System.out.println(student.name+" boarded on the bus."); 
        }
    }
    public void board(BracuStudent student1,BracuStudent student2){
        board(student1);
        board(student2);
    }
    public void showDetails(){
        System.out.println("Bus Route: "+route);
        System.out.println("Passenger Count: 0 (Max: "+passenger_count+")");
        System.out.println("Passengers on Board: ");
        for(int i=0;i<count;i++){
            System.out.print(passenger_name[i]+" ");
        }
    }
}
