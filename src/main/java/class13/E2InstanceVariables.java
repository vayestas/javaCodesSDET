package class13;

public class E2InstanceVariables {

    String name="Hind";// instance variable in class but outside
                        // of block of code.
                        // can be accessed anywhere within that class

    void printAge(){
        int age=25;
        System.out.println(age);
        System.out.println(name);
        System.out.println(country);
    }
    void printCountry(){
        //System.out.println(age);// only accessible in block created
        System.out.println(name);
        System.out.println(country);
        if(10>5){
            System.out.println(country);
        }
    }

    static String country="Uganda";// static variable

}
