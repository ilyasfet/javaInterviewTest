public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Surcharge de la méthode withdraw pour ajouter des règles spécifiques au compte d'épargne
    @Override
    public void withdraw(Double amount) {
        if (getBalance() - amount < 50) { // Exemple de règle spécifique
            System.out.println("Solde minimum de $50 requis pour les retraits.");
        } else {
            super.withdraw(amount);
        }
    }
}