package class8;

public class T1Arrays {
    public static void main(String[] args) {
        //print in reverse

        char [] chars={'A','B','C','D','F','E','@'};//starts counting form 0-6
        //even though there are 7 elements


        /*
        can also use
        for(int i= chars.length-1; i>=0;i--)
         */
        for (int i = 6; i >=0; i--) {
            System.out.println(chars[i]);
        }
    }
}
