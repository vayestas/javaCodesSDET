package class8;

public class E7BreakKeyword {
    public static void main(String[] args) {

         /*
        you have to search the array for number 45. if it is present
        in the array then print found
         */
        int[] nums={10,23,25,56,45,20};

        for(int n:nums){
            if(n==45){
                System.out.println("Found");
            }
        }
    }
}
