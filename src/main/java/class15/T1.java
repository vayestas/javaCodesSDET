package class15;

public class T1 {
    private String name;

    public T1(String userName){
        name=userName;
        System.out.println(userName);
    }
    public T1(){
        System.out.println("no parameters");
    }

    public static void main(String[] args) {
        new T1();
        new T1("vsatseya");
    }

}
