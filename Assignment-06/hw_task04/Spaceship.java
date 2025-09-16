package hw_task04;

public class Spaceship {

    public String name;
    public int capacity ;
    public Cargo [] cargo_items = new Cargo[100];
    public int count = 0;
    public int current_cargoWeight = 0;
    public Spaceship(String name,int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    public void loadCargo(Cargo location){
        current_cargoWeight+=location.getWeight();
        if(current_cargoWeight<capacity){
            cargo_items[count] = location;
            count++;
            
        }       
        else{
            System.out.println("Warning: Unable to load Neutronium inside Falcon. Exceeds capacity by "+(capacity-current_cargoWeight)*-1);
        }
    }
    public void displayDetails(){
        System.out.println("Spaceship Name : "+name);
        System.out.println("Capacity : "+this.capacity);
        System.out.println("Current Cargo Weight : "+current_cargoWeight);
        System.out.print("Cargo : ");
        for(int i=0;i<count;i++){
            System.out.print(cargo_items[i].getName()+" ");
        }
        System.out.println();
    }
}
