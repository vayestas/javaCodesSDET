package class16;

public class Person {
    private String name;
    private int age;
    private double weight;
    private char gender;
    private int salary;
    private String hariColor;

    public Person(){

    }

    public Person(String name,int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public Person(String name,int age, double weight,char gender){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.gender=gender;
    }

    public Person(String name,int age,double weight,char gender,int salary,String hariColor){
        this(name,age,weight,gender);
        this.salary=salary;
        this.hariColor=hariColor;
    }

    public void printInfo(){
        String name="Giu";
        System.out.println(this.name+" "+age+" "+weight+" "+gender);
                        // will make java print Fahim instead of Giu
    }
}
