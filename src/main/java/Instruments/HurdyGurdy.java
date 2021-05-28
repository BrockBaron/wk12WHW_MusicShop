package Instruments;

public class HurdyGurdy extends Instrument  {

    public int noOfStrings;

    public HurdyGurdy(String instrumentName, String instrumentType, String instrumentSubType, String instrumentPlayMethod, String instrumentBaseMaterial, String instrumentSound, String hornSachId, String sound, double wholesalePrice, double retailPrice, int noOfStrings) {
        super(instrumentName, instrumentType, instrumentSubType, instrumentPlayMethod, instrumentBaseMaterial, instrumentSound, hornSachId, sound, wholesalePrice, retailPrice);
        this.noOfStrings = noOfStrings;
    }
}
