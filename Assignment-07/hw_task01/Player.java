package hw_task01;

public class Player {
    
    public String name;
    public String country;
    public int jersey_no;
    public static String [] player_list = new String [11];
    public static int total = 0;

    public Player(String name,String country,int jersey_no){
        this.name = name;
        this.country = country;
        this.jersey_no = jersey_no;
        player_list[total]=name;
        total++;
    }
    public String player_detail(){
        return "Player Name : "+this.name+"\nJersey Number : "+this.jersey_no+"\nCountry : "+country;
    }
    public static void info(){
        System.out.println("Total number of players : "+total);
        System.out.println("Players enlisted so far: ");
        for(int i=0;i<total;i++){
            System.out.print(player_list[i]+" ");
        }
        System.out.println();
    }
}
