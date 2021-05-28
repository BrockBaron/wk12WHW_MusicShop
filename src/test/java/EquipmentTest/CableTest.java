package EquipmentTest;

import Equipment.Cable;
import org.junit.Before;
import org.junit.Test;

public class CableTest {

    Cable cable;

    @Before
    public void setUp(){
        cable = new Cable("Dragon BiWire", "AudioQuest", "Cable", "Speaker cable", 150.50, 66800.99, 10, 4);
    }

    @Test
    public void name() {
    }
}
