package class18;

public class BirdTester {
    public static void main(String[] args) {
        Sparrow s=new Sparrow("Passeridae","brown/red",
                "North America",false);
        s.printInfo();

        Parrot p=new Parrot("Psittaciformes","red/green/blue/yellow",
                "South/Central America",false);
        p.printInfo();
    }
}
