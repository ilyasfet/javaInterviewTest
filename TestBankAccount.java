public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("savings", 500);
        BankAccount account2 = new BankAccount("checking", 1000);

        account1.deposit(200);
        account1.withdraw(100);

        account2.deposit(500);
        account2.withdraw(200);

        account1.displayAccountDetails();
        account2.displayAccountDetails();
    }


    public class TestBankAccounts {
        public static void main(String[] args) {
            CheckingAccount checkingAccount = new CheckingAccount("C123", 500);
            SavingsAccount savingsAccount = new SavingsAccount("S456", 1000);
    
            checkingAccount.withdraw(100);
            savingsAccount.withdraw(200);
    
            System.out.println("Solde du compte chèque : " + checkingAccount.getBalance());
            System.out.println("Solde du compte d'épargne : " + savingsAccount.getBalance());
        }
    }
}