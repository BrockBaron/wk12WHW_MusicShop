package InstrumentTest;

import Instruments.HurdyGurdy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HurdyGurdyTest {

    HurdyGurdy hurdyGurdy;


    @Before
    public void setUp(){
        hurdyGurdy = new HurdyGurdy("The 'Moncur'", "Chordophone", "Composite", "Bowed", "Wood", "Gutral-tones", 321.322, 730.54, 1987.68, 6);
    }


    @Test
    public void getName() {
        assertEquals("The 'Moncur'", hurdyGurdy.getInstrumentName());
    }

    @Test
    public void getInstrumentType() {
        assertEquals("Chordophone", hurdyGurdy.getInstrumentType());
    }

    @Test
    public void getInstrumentSubType() {
        assertEquals("Composite", hurdyGurdy.getInstrumentSubType());
    }

    @Test
    public void getInstrumentPlayMethod() {
        assertEquals("Bowed", hurdyGurdy.getInstrumentPlayMethod());
    }

    @Test
    public void getInstrumentBaseMaterial() {
        assertEquals("Wood", hurdyGurdy.getInstrumentBaseMaterial());
    }

    @Test
    public void getInstrumentSound() {
        assertEquals("Gutral-tones", hurdyGurdy.getInstrumentSound());
    }

    @Test
    public void canPlayInstrument() {
        assertEquals("Gutral-tones", hurdyGurdy.playSound());
    }

    @Test
    public void getHornSachId() {
        assertEquals(321.322, hurdyGurdy.getHornSachId(), 0.1);
    }

    @Test
    public void getWholesalePrice() {
        assertEquals(730.54, hurdyGurdy.getWholesalePrice(), 0.1);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(1987.68, hurdyGurdy.getRetailPrice(), 0.1);
    }

    @Test
    public void getNoOfStrings() {
        assertEquals(6, hurdyGurdy.getNoOfStrings());
    }























}
