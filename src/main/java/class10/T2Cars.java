package class10;

public class T2Cars {

    String brand;
    String color;
    int price;
    int year;

    void speed(){
        System.out.println("80 miles per hour");
    }
    void autopilot(){
        System.out.println("Has autopilot");
    }
    void lights(){
        System.out.println("Car has LED lights");
    }

    public static void main(String[] args) {
        T2Cars models=new T2Cars();

        models.brand="Chevrolet";
        models.color="Red";
        models.price=280000;
        models.year=2023;
        System.out.println(models.brand);
        System.out.println(models.color);
        System.out.println(models.price);
        System.out.println(models.year);

        models.speed();
        models.autopilot();
        models.lights();

    }
}
