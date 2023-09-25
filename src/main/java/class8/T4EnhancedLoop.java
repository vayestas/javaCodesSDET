package class8;

public class T4EnhancedLoop {
    public static void main(String[] args) {
        //print numbers greater than 20

        int [] nums={10,23,25,56,45,20};

        int largest=nums[2];
        for(int n:nums){

            if(n>largest){
                largest=n;
            }

        }
        System.out.println(largest);

    }
}
