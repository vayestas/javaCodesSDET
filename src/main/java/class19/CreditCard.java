package class19;
/*
Create a class CreditCard Create an instance method
that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override
method calculate interest. Call the method by creating an
object of each of the three classes
 */

public class CreditCard {
    public void callInterest(double balance){
        System.out.println(balance*0.5);
    }
}

class Visa extends CreditCard{

}

class AX extends CreditCard{

    @Override
    public void callInterest(double balance) {
        super.callInterest(balance);
        System.out.println(balance*0.20);
    }
}
