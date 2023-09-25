package class12;

public class T2MethodsTester {
    /*
    Create a method that will take two int numbers as input
    and return the larger number. call the method in
    a different class and print the results
     */
    public static void main(String[] args) {
        T2Methods t2 = new T2Methods();

        System.out.println(t2.largerNumber(10, 20));

        System.out.println(t2.emailCreate("valeria","ayestas","gmail"));
    }

    /*
    Create a method createEMail(). Based on values of users
    firstName, lastName and email type, your method should
    return complete email address.
    Example: createEmail(John, Snow, gmail) - johnsnow@gmail.com
     */


}



