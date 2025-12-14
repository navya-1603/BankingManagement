## Banking Management System (Core Java)

A console-based Banking Management System built using Core Java and Object-Oriented Programming concepts.
This project simulates basic banking operations like creating accounts, depositing/withdrawing money, transferring funds, and viewing transaction history — all through a simple text-based interface.

---

#### Features
- Account Management
- Create Savings Account
- Create Current Account
- Automatically assigns unique account numbers
- Stores customer details and initial balance
  
---

#### Banking Operations
- Deposit money
- Withdraw money
- Transfer funds between accounts
- Check balance
- View complete transaction history

---

#### Transaction Logging

- Every transaction (deposit/withdraw/transfer) is recorded

- Shows timestamp, type, amount, and account details

---

#### Concepts Used (Core Java)
This project demonstrates strong Java fundamentals:

✔ Object-Oriented Programming
Encapsulation → secure fields with getters/setters
Inheritance → SavingsAccount & CurrentAccount extend Account
Polymorphism → overridden methods for account rules
Abstraction → common operations in base classes

✔ Java Collections Framework
ArrayList for storing accounts & transactions

✔ File Handling (optional, if you add)
For storing account or transaction data

---

#### How to Run
1. Clone the repository
git clone https://github.com/navya-1603/BankingManagement.git

2. Compile
javac bankingmanagement/*.java

3. Run
java bankingmanagement.Main

---

#### Sample Menu
================= Banking Management System =================
1. Create Savings Account
2. Create Current Account
3. Deposit Money
4. Withdraw Money
5. Transfer Funds
6. View Transaction History
7. Show Account Details
8. Exit
   
==============================================================

---

#### Future Enhancements
You can expand the project with:
-  Login & authentication
- Admin/user roles
- File-based or database (JDBC) persistence
- Interest calculation for savings accounts
- GUI using JavaFX or Swing

---

