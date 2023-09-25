package review7;

public class Store {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.title="Nightwork";
        book1.author="Irwin Shaw";
        book1.year=1975;
        book1.price=45;
        //book1.page=298;  CE: variable does not exist in book class

        book1.read();
        book1.changePrice(41);
        double total=book1.totalWithTax(0.1);
        System.out.println("The price with taxes ="+total);

        //new Magazine();
    }
}
