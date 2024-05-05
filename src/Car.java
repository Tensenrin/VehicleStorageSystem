public class Car extends Vehicle {
    private final int DOORS;
    public Car(int wheels, int DOORS, FuelType fuelType) {
        super(wheels, fuelType);
        this.DOORS = DOORS;
    }

    public int getDoors() {
        return this.DOORS;
    }
}
