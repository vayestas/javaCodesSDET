package class6;

public class T11ForLoops {
    public static void main(String[] args) {
        // Print only odd numbers from 100 to 1 (2 different ways)

        for (int i = 99; i >=1 ; i-=2) {
            System.out.println(i+" ");

        }

        int y=99;
        while (y>=1){
            System.out.print(y+" ");
            y-=2;
        }
    }
}
