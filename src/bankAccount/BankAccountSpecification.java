package bankAccount;

public interface BankAccountSpecification {

    /** deposit adds money to the account
     * @param amount - the amount of the deposit, a nonnegative integer
     */
    public void deposit(int amount);

    /** withdraw deducts money from the accoun, if possible
     * @param amount - the amount of the withdrawal, a nonnegative integer
     * @return true, if the withdrawal was successful;
     * return false, otherwise.*/
    public boolean withdraw(int amount);

}