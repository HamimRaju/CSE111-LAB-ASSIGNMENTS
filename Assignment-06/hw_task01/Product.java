package hw_task01;

public class Product {
    private String product_name = "Unknown";
    private double price;
    private int quantity;

    public Product(){

    }
    public Product(String name,double price){
        this.product_name = name;
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public void setQuantity(){

    }
    public int getQuantity(){
        return this.quantity;
    }
    
    public void setPrice(){

    }
    public double getPrice(){
        return this.price;
    }
    public void displayInfo(){
        System.out.println("Product Name : "+this.product_name);
        System.out.println("Price : $"+this.price);
    }
    public void displayInfo(boolean b){
        System.out.println("Product Name : "+this.product_name);
        System.out.println("Price : $"+this.price);
    }
}
