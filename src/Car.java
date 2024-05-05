public class Car extends Vehicle {
    private final int DOORS;
    public Car(int wheels, int DOORS, FuelType fuelType, Owner owner) {
        super(wheels, fuelType, owner);
        this.DOORS = DOORS;
    }

    public int getDoors() {
        return this.DOORS;
    }
}
