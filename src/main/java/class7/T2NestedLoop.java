package class7;

public class T2NestedLoop {
    public static void main(String[] args) {
        //while version of T1

        int i = 0;
        while (i < 4) {

            for (int j = 1; j < 7; j++) {
                if(j!=3){
                System.out.print(j+" ");}
            }
            System.out.println();
            i++;
        }
    }
}
