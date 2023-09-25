package class16;

public class Book {
    /*
    Write Book class that will have instance variables
    and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

    private String title;
    private String author;
    private double price;

    public Book(){

    }
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public Book(String title,String author,double price){
        this(title,author);
        this.price=price;
    }
    public void printInfo(){
        System.out.println(this.title+" "+author+" "+price);
    }
}
