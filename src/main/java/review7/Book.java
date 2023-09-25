package review7;

public class Book {
    String title;
    String author;
    int year;
    double price;

    static int totalBooks;

    void read(){  //return type name
        System.out.println("I am reading "+title+" book by "+author);
    }
    void changePrice(int newPrice){
        System.out.println("The price of the book "+title+" was changed from "+price +" to "+newPrice);
    }

    double totalWithTax(double tax){
       double total=price+(price*tax);
       return total;
    }
}
