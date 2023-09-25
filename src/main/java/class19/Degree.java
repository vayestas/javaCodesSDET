package class19;

public class Degree {
    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{
    @Override
    public void getPrerequisite() {
        super.getPrerequisite();
    }
}

class Masters extends Degree{
    @Override
    public void getPrerequisite(){
        System.out.println("To get masters you need Bachelor degree");
    }
}

class Tester{
    public static void main(String[] args) {
        Degree d=new Degree();
        d.getPrerequisite();

        Bachelors b=new Bachelors();
        b.getPrerequisite();

        Masters m=new Masters();
        m.getPrerequisite();
    }

}