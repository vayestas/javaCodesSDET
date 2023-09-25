package class9;

public class T42DArray {
    public static void main(String[] args) {
        String [][] students={  {"Aysha","Giulia","John","Deepali"},
                                {"A","A+","C","B"}};

        for (int i = 0; i < 4; i++) { // students[0].length can be used instead of 4
            if (students[1][i].equals("A") || students[1][i].equals("B")) {
                System.out.println(students[0][i]); // prints first two names
            }

        }
    }
}
