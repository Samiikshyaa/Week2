package Abstraction.Task2;

public class BankA extends Bank{
    private int balance;
    public BankA(){
        this.balance = 100;
    }
    @Override
    int getBalance() {
        return balance;
    }
}
