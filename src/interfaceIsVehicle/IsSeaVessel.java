package interfaceIsVehicle;

/**
 * interface fille qui hérite de l'interface IsVehicle
 */
public interface IsSeaVessel extends IsVehicle {
	//signature des getters and setters spécifiques à l'interface IsSeaVessel
	/**
     * @return
     */
    public int getDisplacement();

    /**
     * @param value
     */
    public void setDisplacement(int value);

}