package class9;

public class T52DArrays {
    public static void main(String[] args) {
        // print all names in array in nested enhanced for loop

        String [][] cars= {{"Ford","Honda","Chevy","Tesla"},
                            {"BMW","German","Mercedes","Audi"},
                            {"Kia","Genesis","Hyundai","Kia tour"},
                            {"Ferrari","Lambo","Alfa Romeo","Maserati"}};

        for(String[] row:cars){
            for(String brands:row){
                System.out.print (brands+" ");
            }
            System.out.println();
        }

        // index based
        System.out.println("===========");
        for(int i = 0; i< cars.length; i++){
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+"  ");
            }
            System.out.println();
        }
    }

}
