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
}
