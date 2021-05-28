package EquipmentTest;

import Equipment.Cable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CableTest {

    Cable cable;

    @Before
    public void setUp(){
        cable = new Cable("Dragon BiWire", "AudioQuest", "Cable", "Speaker cable", 150.50, 66800.99, 10, 4.0);
    }

    @Test
    public void hasName() {
        assertEquals("Dragon BiWire", cable.getEquipmentName());
    }

    @Test
    public void hasBrand() {
        assertEquals("AudioQuest", cable.getEquipmentBrand());
    }

    @Test
    public void hasType() {
        assertEquals("Cable", cable.getEquipmentType());
    }

    @Test
    public void hasSubtype() {
        assertEquals("Speaker cable", cable.getEquipmentSubType());
    }


    @Test
    public void getWholesalePrice() {
        assertEquals(150.50, cable.getWholesalePrice(), 0.1);
    }


    @Test
    public void getRetailPrice() {
        assertEquals(66800.99, cable.getRetailPrice(), 0.1);

    }

    @Test
    public void hasGaugeValue() {
        assertEquals(10, cable.getWireGauge());
    }

    @Test
    public void hasLength() {
        assertEquals(4, cable.getWireLenght(), 0.2);
    }
}
