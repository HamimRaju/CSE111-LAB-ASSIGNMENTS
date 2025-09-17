package cw_task02;

public class Book {

    public static int total_books_sold;
    public static double total_revenue;
    public String book_name;
    public int price = 150;
    public int discount ;
    public Book (String name,int discount){
        book_name = name;
        this.discount = discount;
        total_books_sold++;
    }
    public double calculate_price(){
        double calculation =0;
        if(book_name =="Java Programming"){
            calculation = price-(price*discount/100.0);
            total_revenue+=calculation;   
        }
        else if(book_name =="Python Programming"){
            calculation = price-(price*discount/100.0);
            total_revenue+=calculation;
        }
        else if(book_name =="Data Structures"){
            calculation = price-(price*discount/100.0);
            total_revenue+=calculation;
        }
        return calculation;
    }
    public void bookDetails(){
        System.out.println("Title : "+book_name);
        System.out.println("Price after Discount : "+calculate_price()+" TK");
    }
}
