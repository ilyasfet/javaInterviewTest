public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountType;

    private static int nextAccountNumber = 1000;

    public BankAccount(String accountType, double initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    // Méthode pour afficher les détails du compte
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}