package Equipment;

public class Speaker extends Equipment {


    public int power;
    public int noOfSpeaker;
    public double height;
    public double width;
    public double depth;
    public double weight;



    public Speaker(String equipmentName, String equipmentBrand, String equipmentType, String equipmentSubType, double wholesalePrice, double retailPrice, int power, int noOfSpeaker, double height, double width, double depth, double weight) {
        super(equipmentName, equipmentBrand, equipmentType, equipmentSubType, wholesalePrice, retailPrice);
        this.power = power;
        this.noOfSpeaker = noOfSpeaker;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }


    public int getPower() {
        return power;
    }

    public int getNoOfSpeaker() {
        return noOfSpeaker;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getWeight() {
        return weight;
    }
}
