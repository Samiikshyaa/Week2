package Abstraction.Task3;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in three subject by the student A");
        Marks a = new A(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("The percentage is: "+a.getPercentage());

        System.out.println("Enter the marks in four subject by the student B");
        Marks b = new B(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("The percentage is: "+b.getPercentage());

    }
}
