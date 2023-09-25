package class10;

public class T1PhoneTester {
    public static void main(String[] args) {
        T1Phone android=new T1Phone();

        android.brand="Samsung";
        android.pixel="Camera";
        android.price=200;
        System.out.println(android.brand);
        System.out.println(android.pixel);
        System.out.println(android.price);

        android.pictures();
        android.sound();
        android.keyboard();
        
    }
}
