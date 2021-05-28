import Equipment.Equipment;
import Instruments.Cowbell;
import Instruments.Instrument;
import org.junit.Before;

public class MusicShopTest {

    MusicShop shop;

    Instrument cowbell;
    Instrument instrument2;
    Instrument instrument3;
    Instrument instrument4;
    Instrument instrument5;

    Equipment speakers;
    Equipment equipment2;
    Equipment equipment3;
    Equipment equipment4;
    Equipment equipment5;



    @Before

    public void before() {

        cowbell = new Cowbell("Funtune CWB-6", "Idiophone", "Percussion", "Struck", "Steel","Konk", 111.242, 2.50, 9.85, 6);



        shop = new MusicShop();
    }
}
