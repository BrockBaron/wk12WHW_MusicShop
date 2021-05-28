package Equipment;

public class Amp extends Equipment{
    public int power;

    public Amp(String equipmentName, String equipmentBrand, String equipmentType, String equipmentSubType, double wholesalePrice, double retailPrice, int power) {
        super(equipmentName, equipmentBrand, equipmentType, equipmentSubType, wholesalePrice, retailPrice);
        this.power = power;
    }
}
