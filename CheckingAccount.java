public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Surcharge de la méthode withdraw pour ajouter des règles spécifiques au compte chèque
    @Override
    public void withdraw(Double amount) {
        if (getBalance() - amount < 100) { // Exemple de règle spécifique
            System.out.println("Solde minimum de $100 requis pour les retraits.");
        } else {
            super.withdraw(amount);
        }
    }
}