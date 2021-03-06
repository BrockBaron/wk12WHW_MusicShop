import Behaviour.ISell;
import Equipment.*;
import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;

    Instrument cowbell;
    Instrument accordion;
    Instrument conga;
    Instrument hurdyGurdy;
    Instrument synth;

    Equipment speakers;
    Equipment amp;
    Equipment cable;
    Equipment laser;
    Equipment sheet;

    ArrayList<ISell> stock;



    @Before

    public void before() {

        cowbell = new Cowbell("Funtune CWB-6", "Idiophone", "Percussion", "Struck", "Steel","Konk", 111.242, 2.50, 9.85, 6);
        accordion = new Accordion("Roland FR-8XB", "Aerophone", "Bellows", "Free", "Wood", "WhengWhang", 412.132, 2985.90, 6039.40, 128);
        conga = new Conga("Latin Percussion LP647NY-DW", "Membranophone", "Percussion", "Struck", "Wood", "Boom", 211.23, 127.80, 408.00, 304.8, 760);
        hurdyGurdy = new HurdyGurdy("The 'Moncur'", "Chordophone", "Composite", "Bowed", "Wood", "Gutral-tones", 321.322, 730.54, 1987.68, 6);
        synth = new Synthesizer("Moog Subsequent 25", "Electrophone", "Electric", "Keys", "Plastic", "WapWapWap", 531.1, 430.50, 829.99, 4);

        amp = new Amp("MA9000", "McIntosh", "Amplifier", "Integrated Amplifier",7890.65, 12995.99,300);
        laser = new Laser("CS-2000RGB", "Laserworld", "Laser", "FX Show Laser", 250.87, 1098.73, "RGB", 2500);
        synth = new Synthesizer("Moog Subsequent 25", "Electrophone", "Electric", "Keys", "Plastic", "WapWapWap", 531.1, 430.50, 829.99, 4);
        cable = new Cable("Dragon BiWire", "AudioQuest", "Cable", "Speaker cable", 150.50, 66800.99, 10, 4.0);
        speakers = new Speaker("BeoLab 90", "B&O", "Speaker", "Loudspeaker",34500, 69000, 8200, 18, 1253, 735, 747, 137.37);
        sheet = new SheetMusic("Easy Solos", "Hal Leonard", "Sheet Music", "Jazz", 1.50, 12.50, 16, "Kenny G");

//        ArrayList<Instrument> instruments = new ArrayList<>();
//        ArrayList<Equipment> items = new ArrayList<>();
//        ArrayList<ISell> stock = new ArrayList<>();

        musicShop = new MusicShop();

    }

    @Test
    public void canAddToStock() {
        musicShop.addToStock(amp);
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void canRemoveFromStock() {
        musicShop.addToStock(amp);
        musicShop.addToStock(amp);
        musicShop.addToStock(amp);
        musicShop.removeFromStock(amp);
        assertEquals(2, musicShop.getStockCount());
    }
}
