package class8;

public class T2Arrays {
    public static void main(String[] args) {
        //count how many true values are present in array
        boolean [] conds={true,false,true,false,true,true};
        int count=0;
        for (int i = 0; i < conds.length; i++) {

            // or can use if(conds[i]==true)
            if(conds[i]){
             count++;
            }
        }
        System.out.println(count);
    }
}
