import java.util.ArrayList;
import java.util.List;

/**
 * Class to represent a Vehicle object.
 * This is used as a blueprint for vehicles, hence being Abstract.
 */
public abstract class Vehicle {

    // Attributes
    private final int WHEELS;
    private final FuelType FUEL_TYPE;

    // Constructor(s)

    /**
     *
     * @param wheels
     * @param fuelType
     */
    public Vehicle(int wheels, FuelType fuelType) {
        this.WHEELS = wheels;
        this.FUEL_TYPE = fuelType;
    }

    // Accessors
    public int getWheels() {
        return this.WHEELS;
    }

    public FuelType getFuelType() {
        return this.FUEL_TYPE;
    }

}
