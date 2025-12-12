package BankingManagement;

import java.util.ArrayList;
import java.util.List;

public class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    protected List<Transaction> transactions = new ArrayList<>();

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("deposit", amount));
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("withdraw", amount));
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public void printTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            System.out.println("Transaction History for " + accountNumber + ":");
            for (Transaction tx : transactions) {
                System.out.println(tx);
            }
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

