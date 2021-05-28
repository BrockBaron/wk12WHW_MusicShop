package Equipment;

public class Speaker extends Equipment {

    public String brand;
    public int rmsPower;
    public int diameter;
    public int noOFDrivers;
    public double height;
    public double width;
    public double depth;


    public Speaker(String equipmentName, String equipmentType, String equipmentSubType, double wholesalePrice, double retailPrice, String brand, int rmsPower, int diameter, int noOFDrivers, double height, double width, double depth) {
        super(equipmentName, equipmentType, equipmentSubType, wholesalePrice, retailPrice);
        this.brand = brand;
        this.rmsPower = rmsPower;
        this.diameter = diameter;
        this.noOFDrivers = noOFDrivers;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
}
