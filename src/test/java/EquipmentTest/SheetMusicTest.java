package EquipmentTest;

import Equipment.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheet;

    @Before
    public void setUp(){
        sheet = new SheetMusic("Easy Solos", "Hal Leonard", "Sheet Music", "Jazz", 1.50, 12.50, 16, "Kenny G");
    }


    @Test
    public void hasName() {
        assertEquals("Easy Solos", sheet.getEquipmentName());
    }

    @Test
    public void hasBrand() {
        assertEquals("Hal Leonard", sheet.getEquipmentBrand());
    }

    @Test
    public void hasType() {
        assertEquals("Sheet Music", sheet.getEquipmentType());
    }

    @Test
    public void hasSubtype() {
        assertEquals("Jazz", sheet.getEquipmentSubType());
    }


    @Test
    public void getWholesalePrice() {
        assertEquals(1.50, sheet.getWholesalePrice(), 0.1);
    }


    @Test
    public void getRetailPrice() {
        assertEquals(12.50, sheet.getRetailPrice(), 0.1);

    }

    @Test
    public void getNoOfPages() {
        assertEquals(16, sheet.getNoOfPages());
    }

    @Test
    public void getComposerName() {
        assertEquals("Kenny G", sheet.getComposer());
    }
}


