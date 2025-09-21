package ungraded_01;

public class Player extends SportsPerson{
    //per goal 1000+ total match *10
    public int total_goal;
    public int total_match;
    public double ratio;
    public int earning;

    public Player(String team_name,String player_name,String role,int total_goal,int total_match){
        super(team_name, player_name,role);

        this.total_goal = total_goal;
        this.total_match = total_match;
    }
    public void calculateRatio(){
        double calculation = (double)total_goal/total_match;
        this.ratio = calculation;
    }
    public void printDetails(){
        System.out.println(getNameTeam()+"\nTeam Role : "+role+"\nTotal Goal : "+total_goal+", Total Played : "+total_match);
        System.out.println("Goal Ratio : "+ratio+"\nMatch Earning : "+(total_goal*1000+total_match*10)+"k");
    }
}
