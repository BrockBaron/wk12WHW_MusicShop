package Instruments;

import Behaviour.IPlay;
import Behaviour.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String instrumnetName;
    private String instrumentType;
    private String instrumentSubType;
    private String instrumentPlayMethod;
    private String instumentBaseMaterial;
    private String instrumentSound;
    private String hornSachId;



    private double wholesalePrice;
    private double retailPrice;


    public Instrument(String instrumentName, String instrumentType, String instrumentSubType, String instrumentPlayMethod, String instumentBaseMaterial, String instrumentSound, String hornSachId, double wholesalePrice, double retailPrice) {
        this.instrumnetName = instrumentName;
        this.instrumentType = instrumentType;
        this.instrumentSubType = instrumentSubType;
        this.instrumentPlayMethod = instrumentPlayMethod;
        this.instumentBaseMaterial = instumentBaseMaterial;
        this.instrumentSound = instrumentSound;
        this.hornSachId = hornSachId;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public String getInstrumnetName() {
        return instrumnetName;
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

    public String getInstumentBaseMaterial() {
        return instumentBaseMaterial;
    }

    public String getInstrumentSound() {
        return instrumentSound;
    }

    public String getHornSachId() {
        return hornSachId;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
