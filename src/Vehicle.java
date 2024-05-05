/**
 * Class to represent a Vehicle object.
 * This is used as a blueprint for vehicles, hence being Abstract.
 */
public abstract class Vehicle {

    // Attributes
    private int wheels;
    private int doors;
    private FuelType fuelType;

    // Constructor(s)

    /**
     *
     * @param wheels
     * @param doors
     * @param fuelType
     */
    public Vehicle(int wheels, int doors, FuelType fuelType) {
        this.wheels = wheels;
        this.doors = doors;
        this.fuelType = fuelType;
    }

    // Accessors
    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}
