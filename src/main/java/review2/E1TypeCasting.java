package review2;

public class E1TypeCasting {
    public static void main(String[] args) {

        int number=(int)455.555;
        System.out.println(number);
        float number2=20.100F;
        double number3=number2;
        System.out.println(number3);

        // boolean bool=(boolean)12.5; error
        char c=(char)65; //explicit --ASCII TABLE =A
        char b=(char)968; // table=ψ
        System.out.println(c);
        System.out.println(b);
        //String s=(String)'C';
    }
}
