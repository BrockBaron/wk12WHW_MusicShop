package EquipmentTest;

import Equipment.Amp;
import org.junit.Before;

public class AmpTest {

    Amp amp;

    @Before
    public void setUp() {
        amp = new Amp("MA9000", "McIntosh", "Amplifier", "Integrated Amplifier",7890.65, 12995.99,300);
    }


}
