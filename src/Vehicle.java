
/**
 * Class to represent a Vehicle object.
 * This is used as a blueprint for vehicles, hence being Abstract.
 */
public abstract class Vehicle {

    // Attributes
    private final int WHEELS;
    private final FuelType FUEL_TYPE;
    private Owner owner;
    // Constructor(s)

    /**
     *
     * @param wheels
     * @param fuelType
     */
    public Vehicle(int wheels, FuelType fuelType, Owner owner) {
        this.WHEELS = wheels;
        this.FUEL_TYPE = fuelType;
        this.owner = owner;
    }

    // Accessors
    public int getWheels() {
        return this.WHEELS;
    }

    public FuelType getFuelType() {
        return this.FUEL_TYPE;
    }

    public Owner getOwner() {
        return this.owner;
    }

}
