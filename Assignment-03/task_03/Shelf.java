package task_03;

public class Shelf {
    int capacity = 0;
    int total_books = 0;

    public void addBooks(int number){
        if(capacity==0){
            System.out.println("Zero capacity. Cannot add books.");
        }
        else if((number+total_books)<capacity){
            total_books+=number;
            System.out.println(number +" books added to shelf.");
        }
        else{
            System.out.println("Exceeds capacity");
        }
        
    }
    public void showDetails(){
        System.out.println("Shelf capacity : "+capacity+"\nNumber of books : "+total_books);
    }
    
}
