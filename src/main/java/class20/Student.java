package class20;

public class Student {
    private String name;
    private String id;

    public Student(String name,String id){  // constructor
        this.name=name;
        this.id=id;
    }
    void printInfo(){  // method
        System.out.println(name+" "+id);
    }
}
