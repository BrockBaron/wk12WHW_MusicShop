package Instruments;

public class HurdyGurdy extends Instrument  {

    public int noOfStrings;

    public HurdyGurdy(String instrumentName, String instrumentType, String instrumentSubType, String instrumentPlayMethod, String instrumentBaseMaterial, String instrumentSound, double hornSachId, double wholesalePrice, double retailPrice, int noOfStrings) {
        super(instrumentName, instrumentType, instrumentSubType, instrumentPlayMethod, instrumentBaseMaterial, instrumentSound, hornSachId, wholesalePrice, retailPrice);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return this.noOfStrings;
    }
}
