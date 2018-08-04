package bankAccount;

import java.util.*;

/**
 * 
 */
public interface BankAccountSpecification {

    /**
     * @param amount
     */
    public void deposit(int amount);

    /**
     * @param amount 
     * @return
     */
    public boolean withdraw(int amount);

}