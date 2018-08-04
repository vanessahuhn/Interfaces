package interfaceIsVehicle;

/**
 * interface fille qui hérite de l'interface IsVehicle
 */
public interface IsLandVessel extends IsVehicle {
	
	//signature des getters and setters spécifiques à l'interface IsLandVessel
    /**
     * @return
     */
    public int getNumWheels();

    /**
     * @param value
     */
    public void setNumWheels(int value);

}