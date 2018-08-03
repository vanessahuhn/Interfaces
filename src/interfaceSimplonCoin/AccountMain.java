package interfaceSimplonCoin;

public class AccountMain extends Account implements InterfaceMain {

    public void virement(double sommeViree,AccountMain compteCredite) {
    	compteCredite.setSolde(compteCredite.getSolde() + sommeViree);
    	solde = solde - sommeViree;
        
    }
}