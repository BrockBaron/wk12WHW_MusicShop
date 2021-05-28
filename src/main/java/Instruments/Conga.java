package Instruments;

public class Conga extends Instrument {

    public int diameter;
    public int height;

    public Conga(String instrumentName, String instrumentType, String instrumentSubType, String instrumentPlayMethod, String instrumentBaseMaterial, String instrumentSound, String hornSachId, String sound, double wholesalePrice, double retailPrice, int diameter, int height) {
        super(instrumentName, instrumentType, instrumentSubType, instrumentPlayMethod, instrumentBaseMaterial, instrumentSound, hornSachId, sound, wholesalePrice, retailPrice);
        this.diameter = diameter;
        this.height = height;
    }
}
