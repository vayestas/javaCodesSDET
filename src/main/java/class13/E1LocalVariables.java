package class13;

public class E1LocalVariables {
    public static void main(String[] args) {

        String name="Java";

        if(10>5){       //local variables are always inside block (curly brackets body)
            int age=23;
            System.out.println(name);
            System.out.println(age);

        }
        //System.out.println(age);  //outside of block
        System.out.println(name);

    }
}
