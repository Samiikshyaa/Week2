package ClassAndObject;

import java.util.Scanner;

public class TestComplex {
    static void add(int r1, int r2, int i1, int i2){
        int r = r1+r2;
        int i = i1+i2;
        System.out.println("The sum of the complex numbers: "+r1+"+"+i1+"i and "+r2+"+"+i2+"i is: "+r+"+"+i+"i");
    }

    static void diff(int r1, int r2, int i1, int i2){
        int r = r1-r2;
        int i = i1-i2;
        System.out.println("The difference of the complex numbers: "+r1+"+"+i1+"i and "+r2+"+"+i2+"i is: "+r+"+"+i+"i");
    }

    static void product(int r1, int r2, int i1, int i2){
        int f1 = r1*r2;
        int f2 = r1*i2;
        int f3 = r2*i1;
        int f4 = i1*i2;
        int r = f1-f4;
        int i = f2+f3;
        System.out.println("The difference of the complex numbers: "+r1+"+"+i1+"i and "+r2+"+"+i2+"i is: "+r+"+"+i+"i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part and the imaginary part of the first complex number: ");
        Complex c1 = new Complex(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the real part and the imaginary part of the second complex number: ");
        Complex c2 = new Complex(sc.nextInt(),sc.nextInt());
        add(c1.getRe(), c2.getRe(), c1.getImg(), c2.getImg());
        diff(c1.getRe(), c2.getRe(), c1.getImg(), c2.getImg());
        product(c1.getRe(), c2.getRe(), c1.getImg(), c2.getImg());
    }

}
