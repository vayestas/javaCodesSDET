package class5;

public class E7ANDOperator {

    public static void main(String[] args) {

        boolean cond1=true;
        boolean cond2=false;
        boolean cond3=true;
        boolean cond4=false;
        boolean result=cond1&&cond2&&cond3&&cond4;
        System.out.println(result); // false --all need to be true in order to be true
        // if there is one false -then it makes it false

    }
}
