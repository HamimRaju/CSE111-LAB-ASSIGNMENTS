package ungraded_4;

public class MobilePhone {
    public int count=0;
    public int capacity=0;
    public String [] name;
    public int [] number;
    public void setContactCapacity(int capacity){
        this.capacity=capacity;
        name = new String[capacity];
        number = new int[capacity]; 
    }
    
    public void addContact(String name, int number){
        if(count<5){
            this.name[count]=name;
            this.number[count]=number;
            count++;
            System.out.println("The contact of "+name +" is added.");
        }
        else{
            System.out.println("Storage Full!!");
        }
    }
    public void makeCall(int number){
        for(int i=0;i<count; i++){
            if(number==this.number[i]){
                System.out.println("Calling "+this.name[i]+" . . .");
                return;
            }
        }       
        System.out.println("Calling "+number+" . . .");
    }
    public void details(){
        System.out.println("Total Contacts: "+count);
        System.out.println("Contact List: ");
        for(int i=0; i<count;i++){
            System.out.println(name[i]+":"+number[i]);
        }
    }
}