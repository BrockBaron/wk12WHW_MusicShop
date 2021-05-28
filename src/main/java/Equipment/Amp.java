package Equipment;

public class Amp extends Equipment{
    public int power;

    public Amp(String equipmentName, String equipmentType, String equipmentSubType, double wholesalePrice, double retailPrice, int power) {
        super(equipmentName, equipmentType, equipmentSubType, wholesalePrice, retailPrice);
        this.power = power;
    }
}
