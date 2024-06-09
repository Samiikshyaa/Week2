package ClassAndObject;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robert",1994,"64C- WallsStreat");
        Employee e2 = new Employee("Sam",2000,"68D- WallsStreat");
        Employee e3 = new Employee("John",1999,"26B- WallsStreat");


        System.out.println("Name\t   Year of joining \t Employee");
        e1.print();
        e2.print();
        e3.print();
    }
}
