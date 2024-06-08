package ClassAndObject;


public class TestTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        double s;
        s = (t.getSide1()+t.getSide2()+t.getSide3())/2.0;
        System.out.println(s);

        double area = Math.sqrt(s*(s-t.getSide1())*(s-t.getSide2())*(s-t.getSide3()));
        System.out.println("The area of the triangle is:"+ area);
    }
}
