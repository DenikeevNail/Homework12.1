package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum) {
        this.amount = amount + sum;
    }
    public void withDraw(double sum) throws LimitException{
        if (amount < sum){
            throw new LimitException("Not Enough Money", amount);
        }
        this.amount = amount - sum;
    }
}
