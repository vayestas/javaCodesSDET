package class25;

import java.util.HashSet;

public class StudentType {
    /*
    Create a Set that will hold Objects of Student Type. In this set we do not care about
    the insertion order. Each student object should have name and studentID. Display name of each student.
     */
    String name;

    String id;

    public StudentType(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void printInfo(){
        System.out.println(name+" "+id);

    }
    public static void main(String[] args) {
        HashSet<StudentType> students=new HashSet<>();
        students.add(new StudentType("Valeria","EEH233"));
        students.add(new StudentType("Zackery","EDM888"));
        students.add(new StudentType("Jeff","ROM6456"));
        students.add(new StudentType("Denise","IYK4756"));

        students.forEach(x -> x.printInfo());


    }

}
