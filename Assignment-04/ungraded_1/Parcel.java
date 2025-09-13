package ungraded_1;

public class Parcel {
    public String name;
    public int weight = 0;
    public double fee = 0.0;

    public Parcel(){
        return;
    }
    public Parcel(String name){
        this.name = name;
    }
    public Parcel(String name,int weight){
        this.name = name;
        this.weight+=weight;
    }
    public void addWeight(int weight){
        this.weight+=weight;
        System.out.println("Updated Weight: "+this.weight);
    }
    public void calcFee(String location){
        if(weight>0){
            double total_fee = (this.weight*20);
            this.fee = total_fee;
            if(location.equals("Dhanmondi")){
                total_fee+=50;
                this.fee = total_fee;
            }
        }
        else{
            this.fee = 0.0;
        }
    }
    public void printDetails(){
        if(this.name==null){
            System.out.println("Set name first");
        }
        else{
            System.out.println("Name : "+this.name);
            System.out.println("Total Weight : "+this.weight);
            System.out.println("Total Fee : "+this.fee);
        }
        
    }
}
