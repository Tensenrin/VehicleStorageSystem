
/**
 * Class to represent a Vehicle object.
 * This is used as a blueprint for vehicles, hence being Abstract.
 */
public abstract class Vehicle {
    // Attributes
    public enum FuelType {
        PETROL,DIESEL,ELECTRIC
    }
    private final String MANUFACTURER;
    private final String MODEL;
    private final int WHEELS;
    private final FuelType FUEL_TYPE;
    private Owner owner;
    // Constructor(s)

    public Vehicle(String manufacturer, String model, int wheels, FuelType fuelType, Owner owner) {
        this.MANUFACTURER = manufacturer;
        this.MODEL = model;
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

    public String getManufacturer() {
        return MANUFACTURER;
    }

    public String getModel() {
        return this.MODEL;
    }
}
