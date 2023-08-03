package class3;

public class E1TypeCasting {

    public static void main(String[] args) {
        // byte->short->int->long->float->double -- size order
        long age=12228475838748L;

        // byte myAge=age;
        byte number=10;
        int number2=number;
        System.out.println(number2);

        float num1=15.6F;
        int num2;
        num2=(int)num1;

        System.out.println(num2);
    }
}
