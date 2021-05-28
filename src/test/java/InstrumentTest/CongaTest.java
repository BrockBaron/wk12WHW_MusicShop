package InstrumentTest;

import Instruments.Conga;
import org.junit.Before;

public class CongaTest {

    Conga conga;

    @Before

    public void before() {

        conga = new Conga("", "Membranophone", "Precusion", "Strike", "Wood", "Boom", 211.23, 127.80, 408.00, 300, 76);

    }
}
