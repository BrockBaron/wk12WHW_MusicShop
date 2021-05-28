package Equipment;

public class Laser extends Equipment {

    public String laserColour;
    public int laserSpanDistance;

    public Laser(String equipmentName, String equipmentType, String equipmentSubType, double wholesalePrice, double retailPrice, String laserColour, int laserSpanDistance) {
        super(equipmentName, equipmentType, equipmentSubType, wholesalePrice, retailPrice);
        this.laserColour = laserColour;
        this.laserSpanDistance = laserSpanDistance;
    }
}
