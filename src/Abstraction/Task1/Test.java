package Abstraction.Task1;

public class Test {
    public static void main(String[] args) {
        Parent c1 = new Child1();
        c1.message();
        Parent c2 = new Child2();
        c2.message();
    }
}
