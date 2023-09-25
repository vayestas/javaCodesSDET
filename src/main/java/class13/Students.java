package class13;

public class Students {
    /*
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
     */
    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students obj1=new Students();
        obj1.name="Valeria";
        obj1.ID="ED344544";
        numberOfStudents++;

        Students obj2=new Students();
        obj2.name="Milton";
        obj2.ID="KH887667";
        numberOfStudents++;

        Students obj4=new Students();
        obj4.name="Zackery";
        obj4.ID="NV2287560";
        numberOfStudents++;

        System.out.println("Number of Students is: "+numberOfStudents);
    }
}
