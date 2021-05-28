package EquipmentTest;

import Equipment.SheetMusic;
import org.junit.Before;
import org.junit.Test;

public class SheetMusicTest {

    SheetMusic sheet;

    @Before
    public void setUp(){
        sheet = new SheetMusic("Easy Solos", "Hal Leonard", "Sheet Music", "Jazz", 1.50, 12.50, 16, "Kenny G");
    }


    @Test
    public void name() {
    }
}


