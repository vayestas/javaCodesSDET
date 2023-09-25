package class11;

public class E5StringMethods {
    public static void main(String[] args) {
        //print only 17 is a great batch

        String str="Batch 17 is A great batch. Just Kidding. Please don't take it seriously";

        String subStr=str.substring(6,25);//printing from starting point to ending point
        System.out.println(subStr);     //prints by index

    }
}
