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
    private String hornSachId;
    private String sound;



    private double wholesalePrice;
    private double retailPrice;


    public Instrument(String instrumentName, String instrumentType, String instrumentSubType, String instrumentPlayMethod, String instrumentBaseMaterial, String instrumentSound, String hornSachId, String sound, double wholesalePrice, double retailPrice) {
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



}
