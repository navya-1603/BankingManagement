package BankingManagement;

import java.util.Date;

public class Transaction {
    private String type;
    private double amount;
    private Date timestamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = new Date();
    }

    public String toString() {
        return timestamp + " | " + type.toUpperCase() + ": " + amount;
    }
}
