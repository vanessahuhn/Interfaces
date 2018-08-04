package bankAccount;

/**
 * tests a effectuer
 * deposer 100
 	* resultat : balance = 100
 * retirer moins que balance
 	* resultat : retrait autorise balance -= amount
 * retirer plus que balance
 	* resultat : retrait non autorise balance = balance
 */

public class BankAccountApplication {

	public static void main(String[] args) {
		//creation d'une classe anonyme
		BankAccountSpecification account = new BankAccount();
		//deposer 100_balance = 100
		account.deposit(100);
		//retirer 50_balance = 50
		account.withdraw(50);
		//retirer 60_retrait non autorise_balance = 50
		account.withdraw(60);
	}

}
