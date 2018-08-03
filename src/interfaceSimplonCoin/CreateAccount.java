package interfaceSimplonCoin;

public class CreateAccount {

	public static void main(String[] args) {
		AccountMain pierreAccountMain = new AccountMain();
		AccountMain aureliaAccountMain = new AccountMain();
				
		pierreAccountMain.setSolde(200.0);
    	aureliaAccountMain.setSolde(100.0);
    	System.out.println("Solde du compte de Pierre avant le virement: " + pierreAccountMain.getSolde());
    	System.out.println("Solde du compte de Aurelia avant le virement: " + aureliaAccountMain.getSolde());
    	
    	aureliaAccountMain.virement(25.0, pierreAccountMain);
    	
    	System.out.println("Solde du compte de Pierre après le virement: " + pierreAccountMain.getSolde());
    	System.out.println("Solde du compte de Aurelia après le virement: " + aureliaAccountMain.getSolde());
    	
    }

}