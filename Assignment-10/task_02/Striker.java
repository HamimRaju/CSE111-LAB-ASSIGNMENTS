package task_02;

public class Striker extends Football{

    public int goals;
    public int shots_onTarget;

    public Striker(String name,int age,int stamina,int goals,int shots_onTarget){
        super(name, age, stamina);
        this.goals = goals;
        this.shots_onTarget = shots_onTarget;
    }
    public void display(){
        super.display();
        System.out.println("Goals : "+this.goals);
        System.out.println("Shots on target : "+shots_onTarget);
    }

    public void calculatePerformance(){
        System.out.println((double)goals/shots_onTarget);
    }
}
