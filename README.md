# BankingRepo

A simple plain Java banking system with basic operations including deposit, withdraw, and balance checking.

## Features

- Create bank accounts with account number, holder name, and initial balance
- Deposit money into accounts
- Withdraw money from accounts (with balance validation)
- Check account balance
- Display complete account information
- Input validation for all operations
- Error handling for invalid transactions

## Project Structure

```
BankingRepo/
├── src/
│   ├── BankAccount.java      # Main account class with banking operations
│   └── BankingSystem.java    # Demo application showing usage
└── README.md
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## How to Compile

Navigate to the project directory and compile the Java files:

```bash
cd d:/GitHub/satyagit/BankingRepo
javac src/BankAccount.java src/BankingSystem.java
```

## How to Run

After compiling, run the main class:

```bash
cd src
java BankingSystem
```

## Usage Example

The `BankingSystem.java` file contains a demo that shows how to use the banking system:

```java
// Create a new account
BankAccount account = new BankAccount("ACC001", "John Doe", 1000.00);

// Deposit money
account.deposit(250.00);

// Withdraw money
account.withdraw(150.00);

// Check balance
account.checkBalance();

// Display full account information
account.displayAccountInfo();
```

## BankAccount Class Methods

### Constructor
- `BankAccount(String accountNumber, String accountHolderName, double initialBalance)` - Creates a new bank account

### Methods
- `deposit(double amount)` - Deposits money into the account (returns boolean)
- `withdraw(double amount)` - Withdraws money from the account (returns boolean)
- `getBalance()` - Returns the current balance
- `checkBalance()` - Displays the current balance
- `displayAccountInfo()` - Displays complete account information
- `getAccountNumber()` - Returns the account number
- `getAccountHolderName()` - Returns the account holder's name

## Validation Rules

- Deposit amount must be positive
- Withdrawal amount must be positive
- Withdrawal amount cannot exceed current balance
- Initial balance cannot be negative (defaults to 0 if negative)

## License

This is a simple educational project for demonstrating basic banking operations in Java.
