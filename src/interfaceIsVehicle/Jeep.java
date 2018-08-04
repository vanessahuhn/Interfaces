package interfaceIsVehicle;

/**
 * classe Jeep qui implémente l'interface IsLandVessel qui hérite de l'interface IsVehicle
 */
public class Jeep implements IsLandVessel {

	/**
     * déclaration et instanciation des attributs de la classe Jeep
     */
    String name = null;

    int maxPassengers = 0;

    int maxSpeed = 0;
    
    int numWheels = 0;
	
    /**
     * déclaration de la méthode soundHorn() spécifique à la classe Jeep
     */
	public void soundHorn() {
        System.out.println("BIP BIIIIP");
    }
	
	/**
     * déclaration des getters et setters de la classe Jeep
     */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	

}