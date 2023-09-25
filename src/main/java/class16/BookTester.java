package class16;

public class BookTester {
    public static void main(String[] args) {
        Book b1=new Book("Bag of Bones",
                "Stephen King");
        b1.printInfo();

        Book b2=new Book("The Prince",
                "Niccolo Machiavelli",85);
        b2.printInfo();
    }
}
