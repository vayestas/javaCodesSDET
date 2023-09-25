package class26;

import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> students=new LinkedHashMap<>();
        students.put(1,"Adam");
        students.put(20,"Tom");
        students.put(300,"David");
        students.put(4,"Jenn");
        System.out.println(students);
        students.remove(300);
        System.out.println(students);

        students.replace(20,"Jamil");
        System.out.println(students);
    }
}
