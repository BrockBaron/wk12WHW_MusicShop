package EquipmentTest;

import Equipment.Laser;
import org.junit.Before;

public class LaserTest {

    Laser laser;

    @Before
    public void setUp() throws Exception {
        laser = new Laser("CS-2000RGB", "Laserworld", "Laser", "FX Show Laser", 250.87, 1098.73, "RGB", 2500);
    }


}
