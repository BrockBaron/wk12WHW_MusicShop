import Behaviour.ISell;

import java.util.ArrayList;

public class MusicShop {


    private ArrayList<ISell> stock;


    public MusicShop() {
        this.stock = new ArrayList<>();
    }



    public int getStockCount() {
        return this.stock.size();
    }

    public void addToStock(ISell item) {
        this.stock.add(item);




    }


    // get stock count

//    additems to stock
//

//    remove items from stock
}
