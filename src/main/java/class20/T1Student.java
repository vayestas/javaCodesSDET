package class20;

public class T1Student {
    void read(){
        System.out.println("Students read");
    }
    void eat(){
        System.out.println("Students eat");
    }
    void sleep(){
        System.out.println("Students sleep");
    }
}
class SyntaxStudent extends T1Student{
    @Override
    void read() {
        System.out.println("Students study");
    }
}
class CollegeStudent extends T1Student{
    @Override
    void eat() {
        System.out.println("Students are hungry");
    }
}
class SchoolStudent extends T1Student{
    @Override
    void sleep() {
        System.out.println("Students lose sleep");
    }
}