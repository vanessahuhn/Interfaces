package interfaceIsVehicle;

/**
 * interface fille qui h�rite de l'interface IsVehicle
 */
public interface IsLandVessel extends IsVehicle {
	
	//signature des getters and setters sp�cifiques � l'interface IsLandVessel
    /**
     * @return
     */
    public int getNumWheels();

    /**
     * @param value
     */
    public void setNumWheels(int value);

}