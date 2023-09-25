package class11;

public class T2StringMethods {
    /*
    create a String and print it in reverse order
    Sunday --- yadnuS
     */

    public static void main(String[] args) {
        String str="Sunday";
        for (int i = str.length()-1; i >=0 ; i--) {// the -1 starts it from y
            System.out.print(str.charAt(i));
        }
        System.out.println();

        String day="Sunday";        // another way of printing reverse
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed=reversed+str.charAt(i);
        }
        System.out.print(reversed);



    }

}
