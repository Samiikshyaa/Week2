package Inheritance;

public class RecTest {
    public static void main(String[] args) {
        Rectangle r = new Square(6);
        System.out.println("SQUARE");
        System.out.println("The area of the square is: "+r.area());
        System.out.println("The perimeter of the square is: "+r.perimeter());

        Rectangle r1 = new Rectangle(6,4);
        System.out.println("RECTANGLE");
        System.out.println("The area of the rectangle is: "+r1.area());
        System.out.println("The perimeter of the rectangle is: "+r1.perimeter());
    }
}
