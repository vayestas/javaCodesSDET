package class18;

public class Bird {
    /*
    Create a Bird class create 4 fields and use the Bird class as parent class
    and create 2 classes Using it one sparrow and one parrot use constructors
    make fields private and define printInfo methods as well create
    the object of each class and call the methods
     */

    private String breed;
    private String color;
    private String country;
    private boolean talons;

    public Bird(String breed,String color,String country,boolean talons){
        this.breed=breed;
        this.color=color;
        this.country=country;
        this.talons=talons;
    }
    public Bird(){

    }
    void printInfo(){
        System.out.println(breed+" "+color+" "+country+" "+talons);
    }
}
class Sparrow extends Bird{
    public Sparrow(String breed,String color,String country,boolean talons){
        super(breed,color,country,talons);
    }
}
class Parrot extends Bird{
    boolean talons;
    public Parrot(String breed,String color,String country,boolean talons){
        super(breed,color,country,talons);
        this.talons=talons;
    }
}