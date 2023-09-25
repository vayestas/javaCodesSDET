package class19;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard c=new CreditCard();
        c.callInterest(200);

        Visa v=new Visa();
        v.callInterest(300);

        AX ax=new AX();
        ax.callInterest(400);
    }
}
