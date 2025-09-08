package task_08;

public class Reader {
    public String name="New user";
    public int capacity=0;
    public String [] bookList;
    public int count=0;
    public String createReader(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
        bookList = new String[capacity];
        return"A new reader is created.";
    }
    public void addBook(String book_name){
        if(count<capacity){
            bookList[count]=book_name;
            count+=1;
        }
        else{
            System.out.println("No more capacity");
        }
        
    }
    public void readerInfo(){
        System.out.println("Name: "+name);
        System.out.println("Capacity: "+capacity);
        if(count==0){
            System.out.println("Books: ");
            System.out.println("No books added yet.");
        }
        else{
            System.out.println("Books: ");
            for (int i=0; i<count; i++){
                System.out.println(bookList[i]);
            }

        }

    }
}
