package Instruments;

public class Conga extends Instrument {

    public double diameter;
    public double height;

    public Conga(String instrumentName, String instrumentType, String instrumentSubType, String instrumentPlayMethod, String instrumentBaseMaterial, String instrumentSound, double hornSachId, double wholesalePrice, double retailPrice, double diameter, double height) {
        super(instrumentName, instrumentType, instrumentSubType, instrumentPlayMethod, instrumentBaseMaterial, instrumentSound, hornSachId, wholesalePrice, retailPrice);
        this.diameter = diameter;
        this.height = height;
    }


    public double getDiameter() {
        return this.diameter;
    }

    public double getHeight() {
        return this.height;
    }
}
