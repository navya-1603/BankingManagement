package BankingManagement;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber() + ", " + account.getAccountHolder());
    }

    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

    public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount) {
        Account fromAccount = findAccount(fromAccountNumber);
        Account toAccount = findAccount(toAccountNumber);

        if (fromAccount != null && toAccount != null) {
            if (fromAccount.balance >= amount || fromAccount instanceof CurrentAccount) {
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
                System.out.println("Transferred " + amount + " from " + fromAccountNumber + " to " + toAccountNumber);
            } else {
                System.out.println("Insufficient funds for transfer.");
            }
        }
    }
}
