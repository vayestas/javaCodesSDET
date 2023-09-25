package project2;

public abstract class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects
    by student A and by student B. Create class 'Marks' with an abstract
    method 'getPercentage' that will be returning the average percentage
    of marks. Provide implementation of abstract method in classes 'A'
    and 'B'. The constructor of student A takes the marks in three
    subjects as its parameters and the marks in four subjects as its
    parameters for student B. Test your code
     */
    abstract double getPercentage();
}
class A extends Marks{
    private double math, science, english;

    public A(double math, double science, double english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    @Override
    double getPercentage() {
        double totalMarks= math+science+english;
        return (totalMarks/3.0);
    }
}
class B extends Marks{
    public double math,science,english,history;

    public B(double math, double science, double english, double history) {
        this.math = math;
        this.science = science;
        this.english = english;
        this.history = history;
    }

    @Override
    double getPercentage() {
        double totalMarks=math+science+english+history;
        return (totalMarks/4.0);
    }

    public static void main(String[] args) {
        A studentA=new A(75.8,80.9,94.0);
        double percentageA=studentA.getPercentage();
        System.out.println("Average percentage for student A is: "+percentageA);

        B studentB=new B(85.4,66.0,98.5,89.9);
        double percentageB=studentB.getPercentage();
        System.out.println("Average percentage for student B is: "+percentageB);

    }
}


