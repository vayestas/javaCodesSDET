package class12;

public class T2Methods {
    /*
    Create a method that will take two int numbers as input
    and return the larger number. call the method in
    a different class and print the results
     */

    int largerNumber(int num1,int num2){
        int res;
        if(num1>num2){
            res=num1;
        }else{
            res=num2;
        }
        return res;
    }

    String emailCreate(String firstName,String lastName,String emailType){
        String email;
        email=firstName+lastName+"@"+emailType+".com";
        return email;

        // return firstName+lastName+"@"+emailType+".com";
        // can also be used faster

    }
}
