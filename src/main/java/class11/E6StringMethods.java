package class11;

public class E6StringMethods {
    public static void main(String[] args) {

        String str="Batch 17 is good. They are doing good";
        String newStr=str.replace("good","great");
        System.out.println(newStr);// will print great since we replaced it from good
    }
}
