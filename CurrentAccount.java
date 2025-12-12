package BankingManagement;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            transactions.add(new Transaction("withdraw", amount));
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}
