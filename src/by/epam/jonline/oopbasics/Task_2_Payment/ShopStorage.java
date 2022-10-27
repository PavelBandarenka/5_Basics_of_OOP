package by.epam.jonline.oopbasics.Task_2_Payment;

import java.util.ArrayList;
import java.util.List;

public class ShopStorage {
    List<Goods> shopAssortment;


    ShopStorage(){
        this.shopAssortment = new ArrayList<>();
    }

    public List<Goods> getShopAssortment() {
        return shopAssortment;
    }

    public void bringGoods(Goods goods){
        if (checkGoods(goods)){
            shopAssortment.add(goods);
        } else System.out.println("Product does not match, check consignment note");

    }
    private boolean checkGoods(Goods goods){
        return (goods.getName() != null && goods.getPrice() > 0);
    }

}
