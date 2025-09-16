package hw_task04;

public class Cargo {
    
    private String cargo_name;
    private int weight;

    public Cargo(String cargo_name,int weight){
        this.cargo_name = cargo_name;
        this.weight = weight;
    }
    public String getName(){
        return cargo_name;
    }
    public int getWeight(){
        return weight;
    }
}
