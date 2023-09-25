package class24;

public class E5BoxingUnBoxing {
    public static void main(String[] args) {

        Integer a=10;
        Integer number=new Integer(a);
        int d=number.intValue(); // converting from class to primtive
        System.out.println(d);

        Integer c=10;
        int f=c;
    }
}
