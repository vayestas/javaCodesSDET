package class10;

public class E8StringDemo {
    public static void main(String[] args) {

      String str="Today is java class";
        System.out.println(str.startsWith("T"));// will print true - if put lower case (t) will print false
        System.out.println(str.startsWith(" Today"));// will print false b/c of space - must be exact same
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("class"));
    }

}
