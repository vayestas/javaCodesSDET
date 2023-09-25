package class10;

import java.util.Scanner;

public class Task {
    /*
    Store username, password and confirm password from a user and check following requirments

     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String userName="bigBoom";
        String passWord="Stitch8825";
        String confirmPassword="Stitch8825";

        if(userName.isEmpty()||passWord.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        }else if(passWord.length()<8){
            System.out.println("Password is too short");
        }else if(passWord.contains(userName)){
            System.out.println("Password cannot contain username");
        }else if(!passWord.equals(confirmPassword)){
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your Username and Password has been created");
        }
    }
}
