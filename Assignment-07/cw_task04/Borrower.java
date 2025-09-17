package cw_task04;

public class Borrower {

    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    public String name;
    public String [] book_borrowed = new String[3];
    public int count = 0;

    public static void bookStatus(){
        System.out.println("Available books : ");
        for(int i=0;i<book_count.length;i++){
            System.out.println(book_name[i]+" : "+book_count[i]);
        }
    }
    public Borrower(String name){
        this.name = name;
    }
    public void borrowBook(String book_name){
        for(int i=0;i<Borrower.book_name.length;i++){
            if(Borrower.book_name[i].equals(book_name)){
                if(Borrower.book_count[i]>0){
                    book_borrowed[count]=book_name;
                    count++;
                    book_count[i]--;
                }
                else{
                    System.out.println("This book is not available.");
                }
            }
        }
        
    }
    public static int remainingBooks(String book_name){
        for(int i=0;i<Borrower.book_name.length;i++){
            if(book_name.equals(Borrower.book_name[i])){
                return Borrower.book_count[i];
            }
        }
        return 0;
    }
    public void borrowerDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Books Borrowed : ");
        for(int i=0;i<count;i++){
            System.out.println(book_borrowed[i]);
        }
    }

}
