package interfaceIsVehicle;

/**
 * interface fille qui h�rite de l'interface IsVehicle
 */
public interface IsSeaVessel extends IsVehicle {
	//signature des getters and setters sp�cifiques � l'interface IsSeaVessel
	/**
     * @return
     */
    public int getDisplacement();

    /**
     * @param value
     */
    public void setDisplacement(int value);

}