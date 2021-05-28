package Equipment;

public class Laser extends Equipment {

    public String laserColour;

    public int laserPower;

    public Laser(String equipmentName, String equipmentBrand, String equipmentType, String equipmentSubType, double wholesalePrice, double retailPrice, String laserColour, int laserPower) {
        super(equipmentName, equipmentBrand, equipmentType, equipmentSubType, wholesalePrice, retailPrice);
        this.laserColour = laserColour;

        this.laserPower = laserPower;
    }

    public String getLaserColour() {
        return laserColour;
    }



    public int getLaserPower() {
        return laserPower;
    }
}

