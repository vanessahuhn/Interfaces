package interfaceIsVehicle;

/**
 * interface mère
 */
public interface IsVehicle {
	//signature des getters et setters partagés par les deux interfaces filles
    /**
     * @return
     */
    public String getName();

    /**
     * @param value
     */
    public void setName(String value);

    /**
     * @return
     */
    int getMaxPassengers();

    /**
     * @param value
     */
    void setMaxPassengers(int value);

    /**
     * @return
     */
    int getMaxSpeed();

    /**
     * @param value
     */
    void setMaxSpeed(int value);

}