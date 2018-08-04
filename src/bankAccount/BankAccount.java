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
    }

    /**
     * @param amount 
     * @return
     */
    public boolean withdraw(int amount) {
        if (amount <= balance) {
        	balance = balance - amount;
        	return true;
        }
        return false;
    }

}