package Instruments;

public class Synthesizer extends Instrument{

    public int noOfValves;

    public Synthesizer(String instrumentName, String instrumentType, String instrumentSubType, String instrumentPlayMethod, String instrumentBaseMaterial, String instrumentSound, String hornSachId, String sound, double wholesalePrice, double retailPrice, int noOfValves) {
        super(instrumentName, instrumentType, instrumentSubType, instrumentPlayMethod, instrumentBaseMaterial, instrumentSound, hornSachId, sound, wholesalePrice, retailPrice);
        this.noOfValves = noOfValves;
    }
}
