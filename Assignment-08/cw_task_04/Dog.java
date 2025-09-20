package cw_task_04;

public class Dog extends Animal{
    String breed;
    public Dog(String name,int age,String colour,String breed){
        super(name, age, colour);
        this.breed = breed;
    }
    public String info(){
        return super.info()+"Breed : "+this.breed;
    }

    public void makeSound(){
        System.out.println(color+" color "+name+" is barking.");
    }
}
