package ps_1601_1700.alg_1603_design_parking_system;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingSystemTest {

    @Test
    public void testcase1() {
        ParkingSystem p = new ParkingSystem(1, 1, 1);

        assertTrue(p.addCar(1));
        assertFalse(p.addCar(1));

        assertTrue(p.addCar(2));
        assertFalse(p.addCar(2));

        assertTrue(p.addCar(3));
        assertFalse(p.addCar(3));
    }
}