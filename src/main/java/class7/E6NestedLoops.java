package class7;

public class E6NestedLoops {
    public static void main(String[] args) {
        /*
        for(int j=0; j<=5; j++){
            for(int =0; i<=j; i++){
                System.out.print("#");
           }
           System.out.println();
           }
         */

        for (int i = 5; i > 1; i--) {

            for (int j = i; j < 6; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
