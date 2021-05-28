package InstrumentTest;

import Instruments.Synthesizer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SynthesizerTest {

    Synthesizer synth;

    @Before
    public void setUp(){
        synth = new Synthesizer("Moog Subsequent 25", "Electrophone", "Electric", "Keys", "Plastic", "WapWapWap", 531.1, 430.50, 829.99, 4);
    }


    @Test
    public void getName() {
        assertEquals("Moog Subsequent 25", synth.getInstrumentName());
    }

    @Test
    public void getInstrumentType() {
        assertEquals("Electrophone", synth.getInstrumentType());
    }

    @Test
    public void getInstrumentSubType() {
        assertEquals("Electric", synth.getInstrumentSubType());
    }

    @Test
    public void getInstrumentPlayMethod() {
        assertEquals("Keys", synth.getInstrumentPlayMethod());
    }

    @Test
    public void getInstrumentBaseMaterial() {
        assertEquals("Plastic", synth.getInstrumentBaseMaterial());
    }

    @Test
    public void getInstrumentSound() {
        assertEquals("WapWapWap", synth.getInstrumentSound());
    }

    @Test
    public void canPlayInstrument() {
        assertEquals("WapWapWap", synth.playSound());
    }

    @Test
    public void getHornSachId() {
        assertEquals(531.1, synth.getHornSachId(), 0.1);
    }

    @Test
    public void getWholesalePrice() {
        assertEquals(430.50, synth.getWholesalePrice(), 0.1);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(829.99, synth.getRetailPrice(), 0.1);
    }

    @Test
    public void getNoOfStrings() {
        assertEquals(4, synth.getNoOfValves());
    }
    
}
