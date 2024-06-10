package Abstraction.Task3;

public class A extends Marks{
    private int marks1;
    private int marks2;
    private int marks3;

    public A(int marks1,int marks2, int marks3){
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    @Override
    double getPercentage() {
        double percent = ((marks1+marks2+marks3)/300.0)*100.0;
        return percent;
    }
}
