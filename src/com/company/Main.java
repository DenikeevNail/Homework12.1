package com.company;
public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        try {
            while (true) {
                System.out.println("You have = " + bankAccount.amount + " сом");
                bankAccount.withDraw(6000);
                System.out.println("Taken 6000 сом");
            }
        } catch (LimitException not_enough_money) {
            System.out.print(not_enough_money.getMessage());
            try{
                bankAccount.withDraw(bankAccount.getAmount());
            }
            catch (Exception e){
                System.out.println("withDraw error");
            }
        }

    }
}
