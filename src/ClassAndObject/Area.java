package ClassAndObject;

public class Area {
    private int length;
    private int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int returnArea(){
        int area = length * breadth;
        return area;
    }
}
