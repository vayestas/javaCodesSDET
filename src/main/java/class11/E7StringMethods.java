package class11;

public class E7StringMethods {
    public static void main(String[] args) {

        String str="ksdnfjAZSX232984!@#&&AS";
        System.out.println(str.replaceAll("[A-Z]","="));
                                        // replaced all upper case letters from A to Z to =
        System.out.println(str.replaceAll("[A-C]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]","="));
        System.out.println(str.replaceAll("[&-;]",""));
        System.out.println(str.replaceAll("[A-Z0-9]",""));
        System.out.println(str.replaceAll("[A-Z0-58-9a-j]",""));
        System.out.println(str.replaceAll("//d",""));
        System.out.println(str.replaceAll("//s",""));
        System.out.println(str.replaceAll("[^A-Z]","")); // ^ means do not symbol
        System.out.println(str.replaceAll("[^A-Za-v0-9]",""));







    }
}
