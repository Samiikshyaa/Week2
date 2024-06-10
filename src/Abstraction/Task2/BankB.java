package Abstraction.Task2;

public class BankB extends Bank {
    private int balance;

    public BankB(){
        this.balance = 150;
    }
    @Override
    public int getBalance() {
        return balance;
    }
}
