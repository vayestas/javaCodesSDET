package class8;

public class E4EnhancedLoop {
    public static void main(String[] args) {
        //print numbers greater than 20

        int [] nums={10,23,25,56,45,20};
        int count=0;
        for(int n:nums){
            if(n>20){
                count++;
            }
        }
        System.out.println(count);

    }
}
