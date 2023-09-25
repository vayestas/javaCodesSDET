package class11;

public class E10StringMethods {
    public static void main(String[] args) {
        //
        String str="Hi There how are you. I am Good. I am Driving";
        String [] strs= str.split(" ");
        System.out.println(strs.length);
        System.out.println(strs[0]);// prints Hi
        System.out.println(strs[10]);// prints Driving

        System.out.println("________________________");

        String words="Hi#There#how#are#you";
        String[] strArr=words.split("[#]");
        System.out.println(strArr.length);
        System.out.println(strArr[1]);


    }
}
