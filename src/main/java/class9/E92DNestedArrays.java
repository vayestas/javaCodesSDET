package class9;

public class E92DNestedArrays {
    public static void main(String[] args) {
        // print all names in array in nested enhanced for loop

        String [][] names= {{"Hind","Mikhail","Ismael","Ahmed"},
                            {"John","Bob","Adam","Tamim"},
                            {"Kim","Andres","Jeff","Milton"},
                            {"David","Steph","Pat","Curtis"}};

        for(String[] row:names){
            for(String v:row){
                System.out.print (v+" ");
            }
            System.out.println();
        }
    }
}
