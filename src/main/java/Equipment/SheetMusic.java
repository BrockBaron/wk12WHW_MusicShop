package Equipment;

public class SheetMusic extends Equipment{

    public int noOfPages;
    public String composer;

    public SheetMusic(String equipmentName, String equipmentBrand, String equipmentType, String equipmentSubType, double wholesalePrice, double retailPrice, int noOfPages, String composer) {
        super(equipmentName, equipmentBrand, equipmentType, equipmentSubType, wholesalePrice, retailPrice);
        this.noOfPages = noOfPages;
        this.composer = composer;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public String getComposer() {
        return composer;
    }
}
