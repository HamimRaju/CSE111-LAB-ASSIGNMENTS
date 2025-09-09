package ungraded_4;

public class Customer {
    public String customer_name;
    public String[] all_item= new String[4];
    public int [] all_price= new int[4];
    public int count = 0;
    public int total_price;


    public void createCustomer(String name){
        customer_name=name;
        
    }
    public void addItem(String item_name, int price){
        if(count<4){
            all_item[count]=item_name;
            all_price[count]=price;
            System.out.println(item_name+" added to cart");
            count++;
        }
        else{
            System.out.println("Cart is full");
        }

    }
    public void addItem(String item1_name, int item1_price, String item2_name, int item2_price){
        if(count < 4){
            all_item[count] = item1_name;
            all_price[count] = item1_price;
            count++;
        } 
        else {
            System.out.println("Cart is full");
            return;
        }

        if(count < 4){
            all_item[count] = item2_name;
            all_price[count] = item2_price;
            count++;
        } 
        else {
            System.out.println("Cart is full");
            return;
        }
        System.out.println(item1_name + " and " + item2_name + " added to cart");
    }
    public void showCart(){
        System.out.println("Customer: "+customer_name);
        for(int i=0;i<count;i++){
            System.out.println("Item: "+all_item[i]+" Price: "+all_price[i]);
        }
    }
    public void calculatePrice(){
        total_price = 0;
        for(int i = 0; i < count; i++){
            total_price += all_price[i];
        }
        System.out.println("Total: " + total_price);
    }
}

