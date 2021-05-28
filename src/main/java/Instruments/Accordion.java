package Instruments;

public class Accordion extends Instrument {

    public int noOfKeys;

    public Accordion(String instrumentName, String instrumentType, String instrumentSubType, String instrumentPlayMethod, String instrumentBaseMaterial, String instrumentSound, String hornSachId, String sound, double wholesalePrice, double retailPrice, int noOfKeys) {
        super(instrumentName, instrumentType, instrumentSubType, instrumentPlayMethod, instrumentBaseMaterial, instrumentSound, hornSachId, sound, wholesalePrice, retailPrice);
        this.noOfKeys = noOfKeys;
    }


}
