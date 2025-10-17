/**
 * BankAccount class represents a basic bank account with deposit, withdraw, and balance operations.
 */
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    /**
     * Constructor to create a new bank account
     * @param accountNumber Unique account number
     * @param accountHolderName Name of the account holder
     * @param initialBalance Initial deposit amount
     */
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        
        // Validate initial balance
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    /**
     * Deposit money into the account
     * @param amount Amount to deposit
     * @return true if deposit successful, false otherwise
     */
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive!");
            return false;
        }
        
        balance += amount;
        System.out.println("Successfully deposited $" + amount);
        return true;
    }

    /**
     * Withdraw money from the account
     * @param amount Amount to withdraw
     * @return true if withdrawal successful, false otherwise
     */
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
            return false;
        }
        
        if (amount > balance) {
            System.out.println("Insufficient balance! Current balance: $" + balance);
            return false;
        }
        
        balance -= amount;
        System.out.println("Successfully withdrew $" + amount);
        return true;
    }

    /**
     * Get current balance
     * @return Current account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Get account number
     * @return Account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Get account holder name
     * @return Account holder name
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Display complete account information
     */
    public void displayAccountInfo() {
        System.out.println("\n========== Account Information ==========");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + String.format("%.2f", balance));
        System.out.println("=========================================\n");
    }

    /**
     * Display only the balance
     */
    public void checkBalance() {
        System.out.println("Current Balance: $" + String.format("%.2f", balance));
    }
}
