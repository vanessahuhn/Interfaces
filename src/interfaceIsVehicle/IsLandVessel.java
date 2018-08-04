package interfaceIsVehicle;

import java.util.*;

/**
 * 
 */
public interface IsLandVessel extends IsVehicle {

    /**
     * 
     */
    public int numWheels = 0;

    /**
     * @return
     */
    public int getNumWheels();

    /**
     * @param value
     */
    public void setNumWheels(int value);

}