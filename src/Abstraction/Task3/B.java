package Abstraction.Task3;

public class B extends Marks{
    private int marks1;
    private int marks2;
    private int marks3;
    private int marks4;

    public B(int marks1, int marks2, int marks3, int marks4){
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }

    @Override
    double getPercentage() {
        double percent = ((marks1+marks2+marks3+marks4)/400.0)*100.0;
        return percent;
    }
}
