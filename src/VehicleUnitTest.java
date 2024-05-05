import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleUnitTest {
    @Test
    public void testOne() {

        /* Made a mistake in CW2... I created instances of Standard,tracked and medical parcel and assigned it to
         * a variable of type Parcel...
         */
        Car cayman = new Car(4,2,FuelType.PETROL);
        assertEquals(4, cayman.getWheels());
        assertEquals(2, cayman.getDoors());
    }
}
