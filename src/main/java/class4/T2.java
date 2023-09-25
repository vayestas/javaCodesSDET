package class4;

public class T2 {
    public static void main(String[] args) {
        double mortgageRate = 6.8;
        int mortgagePrice = 40000;

        if (mortgageRate > 4.5) {
            System.out.println("User will not buy a house");
            if (mortgagePrice > 50000) {
                System.out.println("User will take a loan");
            } else {
                System.out.println("user will pay cash");
            }
        } else {
            System.out.println("User will consider buying");
        }
    }
}
