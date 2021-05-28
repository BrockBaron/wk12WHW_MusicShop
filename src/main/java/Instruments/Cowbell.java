package Instruments;

public class Cowbell extends Instrument {

    public int size;

    public Cowbell(String instrumentName, String instrumentType, String instrumentSubType, String instrumentPlayMethod, String instrumentBaseMaterial, String instrumentSound, String hornSachId, String sound, double wholesalePrice, double retailPrice, int size) {
        super(instrumentName, instrumentType, instrumentSubType, instrumentPlayMethod, instrumentBaseMaterial, instrumentSound, hornSachId, sound, wholesalePrice, retailPrice);
        this.size = size;
    }
}
