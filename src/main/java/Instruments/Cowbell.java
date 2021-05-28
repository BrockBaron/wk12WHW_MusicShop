package Instruments;

import Behaviour.IPlay;

public class Cowbell extends Instrument implements IPlay {

    public int size;

    public Cowbell(String instrumentName, String instrumentType, String instrumentSubType, String instrumentPlayMethod, String instumentBaseMaterial, String instrumentSound, String hornSachId, double wholesalePrice, double retailPrice, int size) {
        super(instrumentName, instrumentType, instrumentSubType, instrumentPlayMethod, instumentBaseMaterial, instrumentSound, hornSachId, wholesalePrice, retailPrice);
        this.size = size;
    }

    public void playSound(Instrument instrument) {

    }
}
