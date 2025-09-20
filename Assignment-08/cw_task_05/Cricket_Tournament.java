package cw_task_05;

public class Cricket_Tournament extends Tournament{
    public int teams;
    public String type = "No type";

    public Cricket_Tournament(){
        super("Default");
    }
    public Cricket_Tournament(String tournament_name,int teams,String type){
        super(tournament_name);

        this.teams=teams;
        this.type = type;
    }
    public String toString(){
        return "Cricket "+super.toString()+ "\nNumber of Teams : "+teams+"\nType : "+type;
    }
}
