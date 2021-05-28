package Equipment;

public class Cable extends Equipment{

    public int wireGauge;
    public double wireLenght;

    public Cable(String equipmentName, String equipmentBrand, String equipmentType, String equipmentSubType, double wholesalePrice, double retailPrice, int wireGauge, double wireLenght) {
        super(equipmentName, equipmentBrand, equipmentType, equipmentSubType, wholesalePrice, retailPrice);
        this.wireGauge = wireGauge;
        this.wireLenght = wireLenght;
    }

    public int getWireGauge() {
        return wireGauge;
    }

    public double getWireLenght() {
        return wireLenght;
    }
}
