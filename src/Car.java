public class Car extends Vehicle {
    private final int DOORS;
    public Car(String manufacturer, String model, int wheels, int DOORS, FuelType fuelType, Owner owner) {
        super(manufacturer,model,wheels,fuelType,owner);
        this.DOORS = DOORS;
    }


}
