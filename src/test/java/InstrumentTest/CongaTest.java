package InstrumentTest;

import Instruments.Conga;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CongaTest {

    Conga conga;

    @Before

    public void before() {

        conga = new Conga("LP647NY-DW", "Membranophone", "Percussion", "Struk", "Wood", "Boom", 211.23, 127.80, 408.00, 300, 760);
    }


    @Test
    public void getName() {
        assertEquals("LP647NY-DW", conga.getInstrumentName());
    }

    @Test
    public void getInstrumentType() {
        assertEquals("Membranophone", conga.getInstrumentType());
    }

    @Test
    public void getInstrumentSubType() {
        assertEquals("Percussion", conga.getInstrumentSubType());
    }

    @Test
    public void getInstrumentPlayMethod() {
        assertEquals("Struck", conga.getInstrumentPlayMethod());
    }

    @Test
    public void getInstrumentBaseMaterial() {
        assertEquals("Wood", conga.getInstrumentBaseMaterial());
    }

    @Test
    public void getInstrumentSound() {
        assertEquals("Boom", conga.getInstrumentSound());
    }

    @Test
    public void canPlayInstrument() {
        assertEquals("Boom", conga.playSound());
    }

    @Test
    public void getHornSachId() {
        assertEquals(211.23, conga.getHornSachId(), 0.1);
    }

    @Test
    public void getWholesalePrice() {
        assertEquals(127.80, conga.getWholesalePrice(), 0.1);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(408.00, conga.getRetailPrice(), 0.1);
    }

    @Test
    public void getSize() {
        assertEquals(300, conga.getDiameter());
    }

    @Test
    public void getSize() {
        assertEquals(760, conga.getHeight());
    }
}
