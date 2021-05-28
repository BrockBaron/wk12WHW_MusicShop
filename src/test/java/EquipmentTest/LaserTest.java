package EquipmentTest;

import Equipment.Laser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaserTest {

    Laser laser;

    @Before
    public void setUp() throws Exception {
        laser = new Laser("CS-2000RGB", "Laserworld", "Laser", "FX Show Laser", 250.87, 1098.73, "RGB", 2500);
    }

    @Test
    public void hasName() {
        assertEquals("CS-2000RGB", laser.getEquipmentName());
    }

    @Test
    public void hasBrand() {
        assertEquals("Laserworld", laser.getEquipmentBrand());
    }

    @Test
    public void hasType() {
        assertEquals("Laser", laser.getEquipmentType());
    }

    @Test
    public void hasSubtype() {
        assertEquals("FX Show Laser", laser.getEquipmentSubType());
    }


    @Test
    public void getWholesalePrice() {
        assertEquals(250.87, laser.getWholesalePrice(), 0.1);
    }


    @Test
    public void getRetailPrice() {
        assertEquals(1098.73, laser.getRetailPrice(), 0.1);

    }

    @Test
    public void getLaserColours() {
        assertEquals("RGB", laser.getLaserColour());
    }

    @Test
    public void hasPowerValue() {
        assertEquals(2500, laser.getLaserPower());

    }
}
