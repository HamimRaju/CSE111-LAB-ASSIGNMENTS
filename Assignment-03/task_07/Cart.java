package task_07;

public class Cart {

    public int cart_number;
    String [] cart_items = new String[3];
    double [] all_price = new double[3];
    int count = 0;
    public double discount = 0;

    public void create_cart(int cart_no){
        cart_number = cart_no;
    }

    public void addItem(String item_name, double price){
        if(count < 3){
            cart_items[count] = item_name;
            all_price[count] = price;
            System.out.println(item_name + " added to cart " + cart_number + ".");
            count++;
            System.out.println("You have " + count + " item(s) in your cart now.");
        }
        else{
            System.out.println("You already have 3 items on your cart");
        }
    }

    public void addItem(double price, String item_name){
        if(count < 3){
            cart_items[count] = item_name;
            all_price[count] = price;
            System.out.println(item_name + " added to cart " + cart_number + ".");
            count++;
            System.out.println("You have " + count + " item(s) in your cart now.");
        }
        else{
            System.out.println("You already have 3 items on your cart");
        }
    }

    public void giveDiscount(int discount){
        this.discount = discount;
    }

    public void cartDetails(){
        double sum = 0;
        System.out.println("Your cart(c" + cart_number + ") : ");
        for (int i = 0; i < count; i++){
            System.out.println(cart_items[i] + " - " + all_price[i]);
            sum += all_price[i];
        }
        double price_after_discount = sum - (sum * discount / 100.0);
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Total price: " + price_after_discount);
    }
}