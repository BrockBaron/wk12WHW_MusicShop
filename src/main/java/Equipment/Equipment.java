package Equipment;

import Behaviour.ISell;

public abstract class Equipment implements ISell {

    private String equipmentName;
    private String equipmentType;
    private String equipmentSubType;

    private double wholesalePrice;
    private double retailPrice;


    public Equipment(String equipmentName, String equipmentType, String equipmentSubType, double wholesalePrice, double retailPrice) {
        this.equipmentName = equipmentName;
        this.equipmentType = equipmentType;
        this.equipmentSubType = equipmentSubType;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public double calculateMarkUp() {
        return (this.retailPrice / this.wholesalePrice) * 100;
    }
}
