package interfaceIsVehicle;

import java.util.*;

/**
 * 
 */
public interface IsVehicle {

    /**
     * 
     */
    public String name = "";

    /**
     * 
     */
    public int maxPassengers = 0;

    /**
     * 
     */
    public int maxSpeed = 0;

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
    public int getMaxPassengers();

    /**
     * @param value
     */
    public void setMaxPassengers(int value);

    /**
     * @return
     */
    public int getMaxSpeed();

    /**
     * @param value
     */
    public void setMaxSpeed(int value);

}