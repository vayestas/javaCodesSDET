package review10;

public class Car implements WashAble{
    public void drive(){
        System.out.println("driving");
    }

    public void wash(){
        System.out.println("you can take a care to car wash service");
    }
}

class Horse implements WashAble{
    public void wash(){
        System.out.println("Horse can wash themselves");
    }

}
