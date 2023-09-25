package class15;

public class Students {
    private String name;
    private int history;
    private int math;
    private int english;

    public Students(String sName,int sHistory,int sMath,int sEnglish){
        name=sName;
        history=sHistory;
        math=sMath;
        english=sEnglish;

    }
    public void printAverage(){
        double average=0;
        average=(history+math+english)/3;
        System.out.println(name+ " Got "+average);
    }

    public static void main(String[] args) {
        Students s1=new Students("Valeria",
                88,96,70);
        s1.printAverage();

        Students s2=new Students("Steph",
                90,85,58);
        s2.printAverage();
    }

}
