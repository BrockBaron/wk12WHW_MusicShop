package InstrumentTest;

import Instruments.Accordion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccordionTest {

    Accordion accordion;

    @Before

    public void dummy() {
        accordion = new Accordion("Roland FR-8XB", "Aerophone", "Bellows", "Free", "Wood", "WhengWhang", 412.132, 2985.90, 6039.40, 128);
    }

    @Test
    public void getName() {
        assertEquals("Roland FR-8XB", accordion.getInstrumentName());
    }

    @Test
    public void getInstrumentType() {
        assertEquals("Aerophone", accordion.getInstrumentType());
    }

    @Test
    public void getInstrumentSubType() {
        assertEquals("Bellows", accordion.getInstrumentSubType());
    }

    @Test
    public void getInstrumentPlayMethod() {
        assertEquals("Free", accordion.getInstrumentPlayMethod());
    }

    @Test
    public void getInstrumentBaseMaterial() {
        assertEquals("Wood", accordion.getInstrumentBaseMaterial());
    }

    @Test
    public void getInstrumentSound() {
        assertEquals("WhengWhang", accordion.getInstrumentSound());
    }

    @Test
    public void canPlayInstrument() {
        assertEquals("WhengWhang", accordion.playSound());
    }

    @Test
    public void getHornSachId() {
        assertEquals(412.132, accordion.getHornSachId(), 0.1);
    }

    @Test
    public void getWholesalePrice() {
        assertEquals(2985.90, accordion.getWholesalePrice(), 0.1);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(6039.40, accordion.getRetailPrice(), 0.1);
    }

    @Test
    public void getNoOfKeys() {
        assertEquals(128, accordion.getNoOfKeys());
    }






}
