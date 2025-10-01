package task_04;

public class Phoenix extends MagicalCreature{

    public int reBirth_cycle;

    public Phoenix(String name,int age,int reBirth_cycle){
        super(name,age);
        this.reBirth_cycle = reBirth_cycle;
    }

    public void makeSound() {
        System.out.println(name + " sings an enchanting song.");
    }

    public void performMagic() {
        System.out.println(name + " is reborn with "+reBirth_cycle+" rebirth cycles.");
    }

    public void regenerate(){
        System.out.println(name+" regenerates its body in a burst of flames.");
    }
}
