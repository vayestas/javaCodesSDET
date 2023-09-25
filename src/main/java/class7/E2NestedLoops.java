package class7;

public class E2NestedLoops {
    public static void main(String[] args) {
        // quicker way for nested loops - will print 7 lines & 5x in a row

        for (int j = 0; j < 7; j++) {

            for (int i = 0; i < 5; i++) {
                System.out.print("+");
            }
            System.out.println();


        }
    }
}
