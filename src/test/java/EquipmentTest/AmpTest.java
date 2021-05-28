package EquipmentTest;

import Equipment.Amp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmpTest {

    Amp amp;

    @Before
    public void setUp() {
        amp = new Amp("MA9000", "McIntosh", "Amplifier", "Integrated Amplifier",7890.65, 12995.99,300);
    }


    @Test
    public void hasName() {
        assertEquals("MA9000", amp.getEquipmentName());
    }

    @Test
    public void hasBrand() {
        assertEquals("McIntosh", amp.getEquipmentBrand());
    }

    @Test
    public void hasType() {
        assertEquals("Amplifier", amp.getEquipmentType());
    }

    @Test
    public void hasSubtype() {
        assertEquals("Integrated Amplifier", amp.getEquipmentSubType());
    }


    @Test
    public void getWholesalePrice() {
        assertEquals(7890.65, amp.getWholesalePrice(), 0.1);
    }


    @Test
    public void getRetailPrice() {
        assertEquals(12995.99, amp.getRetailPrice(), 0.1);

    }

    @Test
    public void hasPowerValue() {
        assertEquals(300, amp.getPower(), 0.1);

    }
}
