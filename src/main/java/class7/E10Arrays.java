package class7;

public class E10Arrays {
    public static void main(String[] args) {
        //creating an array and initializing it
        String [] fruit={"Apple","Orange","Banana","Kiwi","Pineapple"};

        fruit[3]="Mango"; //replaces Kiwi

        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }
    }
}
