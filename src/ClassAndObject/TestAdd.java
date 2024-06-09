package ClassAndObject;

import java.util.Scanner;

public class TestAdd {
    static void add(int feet1,int inch1, int feet2, int inch2){
        int f3 = 0, inch3 = 0;
        int inch = inch1 + inch2;
        if (inch>=12){
            f3 = (int)(inch/12.0);
            inch3 = inch - 12;
        }else {
            inch3 = inch;
        }
        int feet = feet1+feet2+f3;
        System.out.println("The total distance is: "+feet+" ft. "+inch3+ " inch ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first distance in feet-inch");
        AddDistance d1 = new AddDistance(sc.nextInt(), sc.nextInt());
        System.out.println("Enter the second distance in feet-inch ");
        AddDistance d2 = new AddDistance(sc.nextInt(), sc.nextInt());

        add(d1.getFeet(), d1.getInch(), d2.getFeet(), d2.getInch());
    }
}
