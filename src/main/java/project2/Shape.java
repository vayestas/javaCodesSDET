package project2;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods as
    calculateArea and calculatePerimeter. Create 2 classes
    Circle & Square that implements functionality defined in
    the Shape Interface. Test your code.
     */
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea() {

        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
class Square implements Shape {
    private double length;
    public Square(double length){
        this.length=length;
    }

    @Override
    public double calculateArea() {
        return length*length;
    }

    @Override
    public double calculatePerimeter() {
        return 4*length;
    }


    public static void main(String[] args) {
        Circle c=new Circle(4);
        System.out.println("Circle area is: "+c.calculateArea()+" and the " +
                "perimeter is "+c.calculatePerimeter());

        Square s=new Square(8);
        System.out.println("Square area is: "+s.calculateArea()+" and the " +
                "perimeter is "+s.calculatePerimeter());

    }
}

