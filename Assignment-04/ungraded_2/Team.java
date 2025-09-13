package ungraded_2;

public class Team {
    public String team_name;
    String [] players_name = new String[3];
    int [] players_age = new int[3];
    int [] total_matches = new int[3];
    public int count = 0;
    public Team(String country){
        team_name = country;
    }
    public Team (){
        return;
    }
    public void updateName(String country){
        team_name = country;
    }
    public void addPlayer(Player location){
        players_name [count] =location.name;
        players_age [count] = location.age;
        total_matches[count] = location.match;
        count++; 
    }
    public void printDetail(){
        System.out.println("Team : "+team_name);
        System.out.println("List of players: ");
        for(int i=0;i<count;i++){
            System.out.println("Name : "+players_name[i]+"\nAge : "+players_age[i]+", Total matches : "+total_matches[i]);
        }
        
    }
}
