package class19;

public class T2 {

    public static void print(){
        System.out.println("Java is great");
    }

    public static void print(String word){
        System.out.println("Java is "+word);
    }

    public static void main(String[] args) {
        print(); // since printing in same class, don't need T2
        T2.print("amazing");
    }
}
