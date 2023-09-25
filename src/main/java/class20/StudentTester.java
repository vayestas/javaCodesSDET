package class20;

public class StudentTester {
    public static void main(String[] args) {
        T1Student s=new T1Student();
        T1Student[] arr={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].read();
            arr[i].eat();
            arr[i].sleep();
        }
    }
}
