package interfaceIsVehicle;

import java.util.*;

/**
 * 
 */
public interface IsSeaVessel extends IsVehicle {

    /**
     * 
     */
    public int displacement = 0;

    /**
     * @return
     */
    public int getDisplacement();

    /**
     * @param value
     */
    public void setDisplacement(int value);

}