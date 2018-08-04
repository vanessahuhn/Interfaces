package interfaceIsVehicle;

/**
 * classe Hovercraft qui impl�mente les interfaces IsLandVessel et IsSeaVessel qui h�ritent de l'interface IsVehicle
 */
public class Hovercraft implements IsLandVessel, IsSeaVessel {

	/**
     * d�claration et instanciation des attributs de la classe Jeep
     */
    String name = null;

    int maxPassengers = 0;

    int maxSpeed = 0;
    
    int numWheels = 0;
    	
    int displacement = 0;
    
    /**
     * d�claration des m�thodes enterLand() et enterSea() sp�cifiques � la classe Hovercraft
     */    
    public void enterLand() {
    	System.out.println("Vehicle entering land.");
    }
    
    public void enterSea() {
    	System.out.println("Vehicle entering sea.");
    }
    
    /**
     * d�claration des getters et setters de la classe Hovercraft
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

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	

}