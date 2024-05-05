import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleUnitTest {
    @Test
    public void testOne() {

        /*
         * Made a mistake in CW2... I created instances of Standard,tracked and medical parcel and assigned it to
         * a variable of type Parcel...
         */
        Owner grant = new Owner("Grant", "REDACTED", Owner.Gender.MALE, 43, "01 Mirage Lane, Facade, 01234, United States of Illusion");
        Car car = new Car("Porsche", "Cayman", 4, 2, Vehicle.FuelType.PETROL, grant);

        String model = car.getModel();
        String owner = car.getOwner().getFirstName();

        assertEquals("Model Test", model, "Porsche");
        assertEquals("Owner Test", owner, "Grant");
    }
}
