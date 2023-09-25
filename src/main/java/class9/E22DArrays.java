package class9;

public class E22DArrays {
    public static void main(String[] args) {

        String [][] names= {{"Hind","Mikhail","Ismael","Ahmed"},
                            {"John","Bob","Adam","Tamim"},
                            {"Kim","Andres","Jeff","Milton"},
                            {"David","Steph","Pat","Curtis"}};
        String [] row= names[2];
       // System.out.println(row[3]);
        //System.out.println(Arrays.toString(firstRow)); -- prints first row
        for(String name:row){
            System.out.println(name);
        }
    }
}
