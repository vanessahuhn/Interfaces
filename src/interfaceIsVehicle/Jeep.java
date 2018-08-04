package interfaceIsVehicle;

/**
 * 
 */
public class Jeep implements IsLandVessel {

	/**
     * 
     */
    String name = null;

    /**
     * 
     */
    int maxPassengers = 0;

    /**
     * 
     */
    int maxSpeed = 0;
    
    /**
     * 
     */
    int numWheels = 0;
	
    /**
     * 
     */
	public void soundHorn() {
        System.out.println("BIP BIIIIP");
    }

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