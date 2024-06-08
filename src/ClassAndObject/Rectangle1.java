package ClassAndObject;

public class Rectangle1 {
    private int length;
    private int breadth;

    public Rectangle1(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int Area(){
        int area = length*breadth;
        return area;
    }

}
