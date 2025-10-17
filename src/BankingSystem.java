/**
 * BankingSystem class - Main class to demonstrate banking operations
 */
public class BankingSystem {
    
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("     Welcome to Simple Banking System");
        System.out.println("===============================================\n");
        
        // Create bank accounts
        BankAccount account1 = new BankAccount("ACC001", "John Doe", 1000.00);
        BankAccount account2 = new BankAccount("ACC002", "Jane Smith", 500.00);
        
        // Display initial account information
        System.out.println("Initial Account Setup:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        
        // Perform operations on Account 1
        System.out.println("\n--- Operations on Account 1 (John Doe) ---");
        account1.checkBalance();
        
        System.out.println("\nDepositing $250.00...");
        account1.deposit(250.00);
        account1.checkBalance();
        
        System.out.println("\nWithdrawing $150.00...");
        account1.withdraw(150.00);
        account1.checkBalance();
        
        // Try invalid operations
        System.out.println("\nAttempting to withdraw $5000.00 (should fail)...");
        account1.withdraw(5000.00);
        
        System.out.println("\nAttempting to deposit -$50.00 (should fail)...");
        account1.deposit(-50.00);
        
        // Perform operations on Account 2
        System.out.println("\n\n--- Operations on Account 2 (Jane Smith) ---");
        account2.checkBalance();
        
        System.out.println("\nDepositing $1500.00...");
        account2.deposit(1500.00);
        account2.checkBalance();
        
        System.out.println("\nWithdrawing $800.00...");
        account2.withdraw(800.00);
        account2.checkBalance();
        
        // Display final account information
        System.out.println("\n\n===============================================");
        System.out.println("     Final Account Summary");
        System.out.println("===============================================");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        
        System.out.println("Thank you for using Simple Banking System!");
        System.out.println("===============================================");
    }
}
