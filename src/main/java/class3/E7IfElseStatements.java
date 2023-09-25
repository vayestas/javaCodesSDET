package class3;

public class E7IfElseStatements {
    public static void main(String[] args) {

        double accountBalance=800;
        double price=1000;
        if(accountBalance>=price){ // is 800 greater or equal to 1000 =false
            System.out.println("You can buy this item");
        }else { // if false then else is shown
            System.out.println("You need to save more");
        }
    }
}
