package InstrumentTest;

import Instruments.Cowbell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CowbellTest {

    Cowbell cowbell;

    @Before
    public void before() {
        cowbell = new Cowbell("Funtune CWB-6", "Idiophone", "Percussion", "Struck", "Steel","Konk", 111.242, 2.50, 9.85, 6);
    }

    @Test
    public void getName() {
        assertEquals("Funtune CWB-6", cowbell.getInstrumentName());
    }

    @Test
    public void getInstrumentType() {
        assertEquals("Idiophone", cowbell.getInstrumentType());
    }

    @Test
    public void getInstrumentSubType() {
        assertEquals("Percussion", cowbell.getInstrumentSubType());
    }

    @Test
    public void getInstrumentPlayMethod() {
        assertEquals("Struck", cowbell.getInstrumentPlayMethod());
    }

    @Test
    public void getInstrumentBaseMaterial() {
        assertEquals("Steel", cowbell.getInstrumentBaseMaterial());
    }

    @Test
    public void getInstrumentSound() {
        assertEquals("Konk", cowbell.getInstrumentSound());
    }

    @Test
    public void getHornSachId() {
        assertEquals(111.242, cowbell.getHornSachId(), 0.1);
    }

    @Test
    public void getWholesalePrice() {
        assertEquals(2.50, cowbell.getWholesalePrice(), 0.1);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(9.85, cowbell.getRetailPrice(), 0.1);
    }

    @Test
    public void getSize() {
        assertEquals(6, cowbell.getSize());
    }
}
