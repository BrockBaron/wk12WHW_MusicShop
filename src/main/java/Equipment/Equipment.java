package Equipment;

import Behaviour.ISell;

public abstract class Equipment implements ISell {

    private String equipmentName;
    private String equipmentBrand;
    private String equipmentType;
    private String equipmentSubType;

    private double wholesalePrice;
    private double retailPrice;


    public Equipment(String equipmentName, String equipmentBrand, String equipmentType, String equipmentSubType, double wholesalePrice, double retailPrice) {
        this.equipmentName = equipmentName;
        this.equipmentBrand = equipmentBrand;
        this.equipmentType = equipmentType;
        this.equipmentSubType = equipmentSubType;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public double calculateMarkUp() {
        return (this.retailPrice / this.wholesalePrice) * 100;
    }


    public String getEquipmentName() {
        return equipmentName;
    }

    public String getEquipmentBrand() {
        return equipmentBrand;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public String getEquipmentSubType() {
        return equipmentSubType;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
