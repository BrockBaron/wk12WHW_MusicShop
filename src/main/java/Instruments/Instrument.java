package Instruments;

import Behaviour.IPlay;
import Behaviour.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String instrumentName;
    private String instrumentType;
    private String instrumentSubType;
    private String instrumentPlayMethod;
    private String instrumentBaseMaterial;
    private String instrumentSound;
    private double hornSachId;



    private double wholesalePrice;
    private double retailPrice;


    public Instrument(String instrumentName, String instrumentType, String instrumentSubType, String instrumentPlayMethod, String instrumentBaseMaterial, String instrumentSound, double hornSachId, double wholesalePrice, double retailPrice) {
        this.instrumentName = instrumentName;
        this.instrumentType = instrumentType;
        this.instrumentSubType = instrumentSubType;
        this.instrumentPlayMethod = instrumentPlayMethod;
        this.instrumentBaseMaterial = instrumentBaseMaterial;
        this.instrumentSound = instrumentSound;
        this.hornSachId = hornSachId;

        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public String playSound() {
        return this.instrumentSound;
    }

    public double calculateMarkUp() {
        return (this.retailPrice / this.wholesalePrice) * 100;
    }


    public String getInstrumentName() {
        return instrumentName;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public String getInstrumentSubType() {
        return instrumentSubType;
    }

    public String getInstrumentPlayMethod() {
        return instrumentPlayMethod;
    }

    public String getInstrumentBaseMaterial() {
        return instrumentBaseMaterial;
    }

    public String getInstrumentSound() {
        return instrumentSound;
    }

    public double getHornSachId() {
        return hornSachId;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
