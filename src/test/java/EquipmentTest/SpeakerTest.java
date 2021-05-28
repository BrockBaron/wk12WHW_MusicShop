package EquipmentTest;

import Equipment.Speaker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpeakerTest {

    Speaker speaker;

    @Before
    public void before() {
        speaker = new Speaker("BeoLab 90", "B&O", "Speaker", "Loudspeaker",34500, 69000, 8200, 18, 1253, 735, 747, 137.37);
    }


    @Test
    public void hasName() {
        assertEquals("BeoLab 90", speaker.getEquipmentName());
    }

    @Test
    public void hasBrand() {
        assertEquals("B&O", speaker.getEquipmentBrand());
    }

    @Test
    public void hasType() {
        assertEquals("Speaker", speaker.getEquipmentType());
    }

    @Test
    public void hasSubtype() {
        assertEquals("Loudspeaker", speaker.getEquipmentSubType());
    }


    @Test
    public void getWholesalePrice() {
        assertEquals(34500, speaker.getWholesalePrice(), 0.1);
    }


    @Test
    public void getRetailPrice() {
        assertEquals(69000, speaker.getRetailPrice(), 0.1);

    }

    @Test
    public void hasPowerValue() {
        assertEquals(8200, speaker.getPower(), 0.1);

    }


    @Test
    public void hasNoOfSpeaker() {
        assertEquals(18, speaker.getNoOfSpeaker());

    }

    @Test
    public void hasHeight() {
        assertEquals(1253, speaker.getHeight(), 0.1);

    }

    @Test
    public void hasWidth() {
        assertEquals(735, speaker.getWidth(), 0.1);
    }

    @Test
    public void hasDepth() {
        assertEquals(747, speaker.getDepth(), 0.1);
    }

    @Test
    public void hasWeight() {
        assertEquals(137.37, speaker.getWeight(), 0.1);
    }
}


