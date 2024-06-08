package ClassAndObject;

import java.util.Scanner;

public class Rectangle {
    private int length;
     private int breadth;

     void setDim(int length, int breadth){
         this.length = length;
         this.breadth = breadth;
     }

     int getArea(){
         return length*breadth;
     }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int b = sc.nextInt();
        r.setDim(l,b);
        System.out.println("The area of the rectangle is: "+r.getArea());

    }
}
