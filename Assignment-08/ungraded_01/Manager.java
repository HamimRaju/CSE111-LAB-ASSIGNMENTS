package ungraded_01;

public class Manager extends SportsPerson{
    //match win *1000
    public int total_win;
    public Manager(String team_name,String name,String role,int total_win){
        super(team_name, name, role);

        this.total_win = total_win;
    }
    public void printDetails(){
        System.out.println(getNameTeam()+"\nTotal Win : "+total_win+"\nMatch Earning : "+total_win*1000+"k");
    }
}
