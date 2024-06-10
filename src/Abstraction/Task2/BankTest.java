package Abstraction.Task2;

public class BankTest {
    public static void main(String[] args) {
        Bank a = new BankA();
        System.out.println("The bank a balance is: "+a.getBalance());
        Bank b = new BankB();
        System.out.println("The bank b balance is: "+b.getBalance());
        Bank c = new BankC();
        System.out.println("The bank c balance is: "+c.getBalance());
    }
}
