package hw_task03;

public class Cargo {

    public static int cargo_ID = 0;
    public String content;
    public double weight;
    public boolean loaded = false;

    public static double capacity =10;

    public static double capacity(){
        return Cargo.capacity;
    }
    public Cargo(String content, double weight){
        cargo_ID++;
        this.content = content;
        this.weight = weight;
    }
    public void load(){
        if(this.weight<=capacity){
            capacity -=this.weight;
            loaded = true;
            System.out.println("Cargo "+cargo_ID+" loaded for transport.");
        }
        else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }   
    }
    public void unload(){
        System.out.println("Cargo 2 unloaded.");
        Cargo.capacity+= this.weight;
    }
    public void details(){
        System.out.println("Cargo ID : "+cargo_ID+", Contents: "+content+", \nWeight : "+this.weight+", Loaded : "+loaded);
    }
}
