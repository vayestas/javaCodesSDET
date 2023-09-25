package class9;

public class HW42DArray {
    public static void main(String[] args) {
        String [][] countries={ {"USA","Canada","Mexico","Greenland"},
                                {"Brazil","Chile","Peru","Colombia"},
                                {"Germany","France","Romania","Netherlands"},
                                {"China","India","Turkey","Jordan"},
                                {"Egypt","Chad","Nigeria","Kenya"}};
        for (int row = 0; row < countries.length; row++) {
            for (int col = 0; col < countries[row].length; col++) {
                System.out.print(countries[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println("==========");
        int totalCountries=0;
        for(int rows=0;rows<countries.length;rows++){
            totalCountries+=countries[rows].length;
        }
        System.out.println("Total of countires is: "+totalCountries);

    }
}
