package class13;

public class E4StringBuilder {
    public static void main(String[] args) {

        String str=new String("Habib");
        String name="Habib";

        StringBuilder stringBuilder=new StringBuilder("Ehab"); // must always use this setting
        //stringBuilder.reverse();
        //System.out.println(stringBuilder);
        //stringBuilder.deleteCharAt(1); // will remove letter "h"
        stringBuilder.append("d"); // will add the letter "d" at the end of "ehab"
        System.out.println(stringBuilder);
    }
}
