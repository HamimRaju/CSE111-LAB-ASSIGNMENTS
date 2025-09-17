package hw_task02;

public class Travel {

    private static int count = 0;
    public String source;
    public String destination;
    public int time = 1;
    public static int getCount(){
        return count;
    }
    public Travel(String source,String destination){
        this.source = source;
        this.destination = destination;
        count++;
    }
    public void setTime(int time){
        this.time = time;
    }
    public void setSource(String source){
        this.source = source;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public String displayTravelInfo(){
        return "Source : "+this.source+"\nDestination : "+this.destination+"\nFlight Time : "+this.time+" : 00"; 
    }
}
