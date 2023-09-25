package class20;

public class ComputerTester {
    public static void main(String[] args) {
        Computer c=new Computer();
        Apple a=new Apple();
        Lenovo l=new Lenovo();
        HP h=new HP();
        Dell d=new Dell();
        Computer[] arr={new Apple(),new Lenovo(),new HP(),new Dell()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].media();
            arr[i].internet();
            arr[i].mouse();
            arr[i].media();
        }

    }
}
