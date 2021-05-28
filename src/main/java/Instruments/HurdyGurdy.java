package Instruments;

import Behaviour.IPlay;

public class HurdyGurdy extends Instrument implements IPlay {

    public int noOfStrings;

    public HurdyGurdy(String instrumentName, String instrumentType, String instrumentSubType, String instrumentPlayMethod, String instumentBaseMaterial, String instrumentSound, String hornSachId, double wholesalePrice, double retailPrice, int noOfStrings) {
        super(instrumentName, instrumentType, instrumentSubType, instrumentPlayMethod, instumentBaseMaterial, instrumentSound, hornSachId, wholesalePrice, retailPrice);
        this.noOfStrings = noOfStrings;
    }


    public void playSound(Instrument instrument) {

    }
}
