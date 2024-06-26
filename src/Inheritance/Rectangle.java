package Inheritance;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return (2*(length+breadth));
    }
}
