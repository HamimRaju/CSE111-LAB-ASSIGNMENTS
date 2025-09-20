package cw_task_05;

public class Tournament {
    private String name;
    public Tournament() {
        this.name = "Default";
    }
    public Tournament(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return "Tournament Name: "+name;
    }
}

