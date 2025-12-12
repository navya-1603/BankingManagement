package BankingManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- BANK MENU -----");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Add Interest");
            System.out.println("7. Transfer Funds");
            System.out.println("8. Transaction History");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();  // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String saNo = sc.nextLine();
                    System.out.print("Enter account holder name: ");
                    String saName = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double saBalance = sc.nextDouble();
                    System.out.print("Enter interest rate: ");
                    double rate = sc.nextDouble();
                    SavingsAccount sa = new SavingsAccount(saNo, saName, saBalance, rate);
                    bank.addAccount(sa);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    String caNo = sc.nextLine();
                    System.out.print("Enter account holder name: ");
                    String caName = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double caBalance = sc.nextDouble();
                    System.out.print("Enter overdraft limit: ");
                    double limit = sc.nextDouble();
                    CurrentAccount ca = new CurrentAccount(caNo, caName, caBalance, limit);
                    bank.addAccount(ca);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    String dAcc = sc.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double dAmt = sc.nextDouble();
                    Account dAccount = bank.findAccount(dAcc);
                    if (dAccount != null) dAccount.deposit(dAmt);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    String wAcc = sc.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    double wAmt = sc.nextDouble();
                    Account wAccount = bank.findAccount(wAcc);
                    if (wAccount != null) wAccount.withdraw(wAmt);
                    break;

                case 5:
                    System.out.print("Enter account number: ");
                    String bAcc = sc.nextLine();
                    Account bAccount = bank.findAccount(bAcc);
                    if (bAccount != null) bAccount.checkBalance();
                    break;

                case 6:
                    System.out.print("Enter savings account number: ");
                    String iAcc = sc.nextLine();
                    Account iAccount = bank.findAccount(iAcc);
                    if (iAccount instanceof SavingsAccount) {
                        ((SavingsAccount) iAccount).addInterest();
                    } else {
                        System.out.println("Not a savings account.");
                    }
                    break;

                case 7:
                    System.out.print("From account number: ");
                    String fromAcc = sc.nextLine();
                    System.out.print("To account number: ");
                    String toAcc = sc.nextLine();
                    System.out.print("Amount: ");
                    double tAmt = sc.nextDouble();
                    bank.transferFunds(fromAcc, toAcc, tAmt);
                    break;

                case 8:
                    System.out.print("Enter account number: ");
                    String hAcc = sc.nextLine();
                    Account hAccount = bank.findAccount(hAcc);
                    if (hAccount != null) hAccount.printTransactionHistory();
                    break;

                case 9:
                    System.out.println("Thank you for using the banking system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
