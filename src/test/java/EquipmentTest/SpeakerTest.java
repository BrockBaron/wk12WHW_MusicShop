package EquipmentTest;

import Equipment.Speaker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpeakerTest {

    Speaker speaker;

    @Before
    public void before() {
        speaker = new Speaker("BeoLab 90", "B&O", "Speaker", "Loudspeaker",34500, 69000, 8200, 18, 1253, 735, 747, 137);
    }


    @Test
    public void hasName() {
        assertEquals("BeoLab 90", speaker.getEquipmentName());
    }

    @Test
    public void hasBrand() {
    }

    @Test
    public void hasType() {
    }

    @Test
    public void hasSubtype() {
    }


    @Test
    public void getWholesalePrice() {
    }


    @Test
    public void getRetailPrice() {
    }

    @Test
    public void hasPowerValue() {
    }


    @Test
    public void hasNoOfSpeaker() {
    }

    @Test
    public void hasHeight() {

    }

    @Test
    public void hasWidth() {
    }

    @Test
    public void hasDepth() {

    }

    @Test
    public void hasWeight() {
    }
}


