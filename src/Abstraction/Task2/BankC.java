package Abstraction.Task2;

public class BankC extends Bank {
    private int balance;

    public BankC(){
        this.balance = 200;
    }

    @Override
    int getBalance() {
        return balance;
    }
}
