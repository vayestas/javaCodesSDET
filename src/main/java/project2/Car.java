package project2;

public class Car {
    /*
    Create a Class Car that would have the following fields: carPrice and
    color and method calculateSalePrice() which should be returning a
    price of the car. Create 2 subclasses: Sedan and Truck. The Truck
    class has a field as weight and has its own implementation of calculateSalePrice()
    method in which returned price is calculated as following: if
    weight>2000 then returned price car should include 10% discount,
    otherwise 20% discount. The Sedan class has field as length and also does
    it its own implementation of calculateSalePrice(): if length of sedan is >20 feet
    then returned car price should include 5% discount, otherwise 10% discount
     */
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
    public double calculateSalePrice(){
        return carPrice;
    }
}
class Sedan extends Car{
    private double length;

    public Sedan(double carPrice, String color,double length) {
        super(carPrice, color);
        this.length=length;
    }
    public double calculateSalePrice(){
        if(length>20){
            return super.calculateSalePrice()*0.95;
        }else{
            return super.calculateSalePrice()*0.90;
        }
    }
}
class Truck extends Car {
    private double weight;

    public Truck(double carPrice, String color,double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    public double calculateSalePrice(){
        if(weight>2000){
            return super.calculateSalePrice() * 0.90;
        }else{
            return super.calculateSalePrice()*0.80;
        }
    }

    public static void main(String[] args) {
        Sedan s=new Sedan(325000,"Blue",24);
        System.out.println("Sedan price is: "+s.calculateSalePrice());

        Truck t=new Truck(450000,"Green",300);
        System.out.println("Truck price is: "+t.calculateSalePrice());
    }
}
