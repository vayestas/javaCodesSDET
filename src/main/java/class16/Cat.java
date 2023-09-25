package class16;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private String color;
    private char gender;
    private String breed;

    public Cat(){

    }

    public Cat(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public Cat(String name, int age, double weight, String color){
        this(name,age,weight);
        this.color=color;
    }
    public Cat(String name, int age, double weight, String color, char gender){
        this(name,age,weight,color);
        this.gender=gender;
    }
    public Cat(String name, int age, double weight, String color, char gender, String breed){
       this(name,age,weight,color,gender);
        this.breed=breed;
    }

    public void printInfo(){
        System.out.println(this.name+" "+age+" "+weight+" "+color+" "+gender+" "+breed);
    }
}
