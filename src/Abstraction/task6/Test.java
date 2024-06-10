package Abstraction.task6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s = new Area();
        int[] rectangles = new int[4];

        for(int i = 0; i<rectangles.length; i++){
            System.out.println("Enter the length and breadth of the rectangle: ");
            rectangles[i] = s.RectangleArea(sc.nextInt(), sc.nextInt());
        }
        for (int r: rectangles) {
            int sn = 1;
            System.out.println("The area of Rectangle"+sn+" is: "+r);
            sn++;
        }

        int[] squares = new int[4];
        for(int i = 0; i<squares.length; i++){
            System.out.println("Enter the sides of square: ");
            squares[i] = s.SquareArea(sc.nextInt());
        }
        for (int sh: squares) {
            int sn = 1;
            System.out.println("The area of Square"+sn+" is: "+sh);
            sn++;
        }

        double[] circles = new double[5];
        for(int i = 0; i<circles.length; i++){
            System.out.println("Enter the sides of circle: ");
            circles[i] = s.CircleArea(sc.nextInt());
        }
        for (double c: circles) {
            int sn = 1;
            System.out.println("The area of Circle"+sn+" is: "+c);
            sn++;
        }








//        System.out.println("Enter the side of the square: ");
//        s.SquareArea(sc.nextInt());
//
//        System.out.println("Enter the radius: ");
//        s.CircleArea(sc.nextInt());

    }
}
