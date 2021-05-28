package Equipment;

public class Cable extends Equipment{

    public int wireGauge;

    public Cable(String equipmentName, String equipmentBrand, String equipmentType, String equipmentSubType, double wholesalePrice, double retailPrice, int wireGauge) {
        super(equipmentName, equipmentBrand, equipmentType, equipmentSubType, wholesalePrice, retailPrice);
        this.wireGauge = wireGauge;
    }
}
