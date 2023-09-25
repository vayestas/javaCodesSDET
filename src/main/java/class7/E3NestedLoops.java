package class7;

public class E3NestedLoops {
    public static void main(String[] args) {

        //if the (for) is false nothing will print. needs to be true in order to execute

        for (int j = 0; j < 3; j++) {
            for (int i = 2; i < 20; i=i+2) {
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}
