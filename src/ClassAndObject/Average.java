package ClassAndObject;

public class Average {
    private int firstnum;
    private int secondnum;
    private int thirdnum;

    public Average(int firstnum, int secondnum, int thirdnum) {
        this.firstnum = firstnum;
        this.secondnum = secondnum;
        this.thirdnum = thirdnum;
    }

    void calculateAvg(){
        int avg = (firstnum + secondnum + thirdnum)/3;
        System.out.println("The average is: "+avg);
    }
}
