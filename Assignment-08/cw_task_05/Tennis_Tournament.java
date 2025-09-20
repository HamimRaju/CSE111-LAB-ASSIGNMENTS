package cw_task_05;

public class Tennis_Tournament extends Tournament{
    
    public int Players;

    public Tennis_Tournament(String tournament_name,int Players){
        super(tournament_name);
        
        this.Players = Players;
    }
    public String toString(){
        return "Tennis Tournament : "+super.toString()+"\nNumber of Players : "+this.Players;
    }
}
