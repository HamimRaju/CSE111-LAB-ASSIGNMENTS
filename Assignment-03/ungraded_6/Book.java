package ungraded_6;

public class Book {
    public String title;
    public String author="unknown";
    public String genre;
    public int pages;

    public void createBook(String name){
        title=name;
    }
    public void createBook(String name,String author){
        title=name;
        this.author=author;
    }
    public void createBook(String name,String writer,String gen){
        title=name;
        genre=gen;
        author = writer;
    }

    public void customizeGenre(String gen){
        genre=gen;
        System.out.println("Updated the genre of \""+title+"\" to "+genre);
    }
    public void customizePages(int pg){
        pages=pg;
        System.out.println("Updated the pages of \""+title+"\" to "+pages);
    }

    public void displayDetails(){
        System.out.println("Title : "+title+", "+"Author : "+author+", "+"Genre : "+genre+", "+"Pages : "+pages);
    }
}
