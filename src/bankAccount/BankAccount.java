package bankAccount;

/**
 * BankAccount manages a single bank account
 * it implements the BankAccountSpecification
 */
public class BankAccount implements BankAccountSpecification {

    /**
     * the account's balance
     */
    private int balance;
    /**
     * Default constructor
     */
    public BankAccount() {
    	balance = 0;
    }

    /**
     * @param amount
     */
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Vous avez depose " + amount + " euros sur votre compte. Votre nouveau solde est de : " + balance + " euros.");
    }

    /**
     * @param amount 
     * @return
     */
    public boolean withdraw(int amount) {
        if (amount <= balance) {
        	balance = balance - amount;
        	System.out.println("Vous avez retire " + amount + " euros de votre compte. Votre nouveau solde est de : " + balance + " euros.");
        	return true;
        }
        System.out.println("Solde insuffisant. Vousne pouvez pas retirer " + amount + " euros. Votre retrait maximum est de : " + balance + " euros.");
        return false;
    }

}