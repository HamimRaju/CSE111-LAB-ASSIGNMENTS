package task_04;

public class Library {
    String [] store_books;
    public int capacity =0;
    int index =0;
    public void setBookCapacity(int capacity){
        this.capacity=capacity;
        store_books = new String[capacity];
    }
    public void addBook(String book){
        if(index<capacity){
            store_books[index]=book;
            index++;
            System.out.println("Book "+"'"+book+"'"+" added to the library.");
        }
        else{
            System.out.println("Maximum capacity exceeds. You can't add more than "+ capacity+" books");
        }
    }
    public void printDetail(){
        System.out.println("Maximum capacity : "+capacity);
        System.out.println("Total books "+index);
        System.out.println("Book List : ");
        for(int i =0 ;i<index;i++){
            System.out.println(store_books[i]);
        }
    }
}
