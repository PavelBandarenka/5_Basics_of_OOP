package by.epam.jonline.oopbasics.Task_2_Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Payment {
   /*
    Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
    нескольких товаров.
    */
    private ShoppingCart shoppingCart;
    private ShopStorage shopStorage;

    private int totalCost;

    private int cashboxBalance;

    Payment(ShopStorage shopStorage, ShoppingCart shoppingCart){
        this.shopStorage = shopStorage;
        this.shoppingCart =shoppingCart;
    }
    public void pay(Wallet money){
        money.setMoney(money.getMoney()-totalCost);
        cashboxBalance += totalCost;
    }
    public void printCheck(){
        System.out.println("-----------------------");
        System.out.println("| Your purchases:       |");
        for (Goods each: shoppingCart.goodsList){
            System.out.println("| name: " + each.getName() +" | cost: " + each.getPrice()+ " |");
        }
        System.out.println("| Total cost: " + totalCost + " |");
        System.out.println("-----------------------");
    }
    public void printCashBoxBalance(){
        System.out.println("-----------------------");
        System.out.println("CashBoxBalance: " + cashboxBalance);
        System.out.println("-----------------------");
    }

    private boolean isCartNotEmpty(){
        return !shoppingCart.goodsList.isEmpty();
    }
    public void countTotalCost(){
        if (isCartNotEmpty()){
            totalCost = 0;
            for (Goods each : shoppingCart.goodsList ) {
                totalCost+= each.getPrice();
            }
        }
    }
    public int getTotalCost() {
        return totalCost;
    }

    public int getCashboxBalance() {
        return cashboxBalance;
    }

    static class ShoppingCart {
        private List<Goods> goodsList;
        private ShopStorage shopStorage;
        ShoppingCart(){}
        ShoppingCart(ShopStorage shopStorage) {
            this.goodsList = new ArrayList<>();
            this.shopStorage = shopStorage;
        }
        public void addToCart(String name) {
            if (isShopStorageNotEmpty() && isGoodExists(name)){
                goodsList.add(goodsComparator(name));
            } else System.out.println("No goods with name: " + name);
        }

        public void removeFromCart(String name) {
            for (int i = 0; i < goodsList.size(); i++){
                if(goodsList.get(i).getName().equals(name)){
                    goodsList.remove(i);
                }
            }
        }


        private boolean isShopStorageNotEmpty() {
            return !shopStorage.getShopAssortment().isEmpty();
        }
        private Goods iterateGoodsInStorage(List<Goods> goods, Predicate<Goods> check) {
            for (Goods each : goods) {
                if (check.test(each)) {
                    return each;
                }
            } return null;
        }

        private boolean isGoodExists(String name){
            return goodsComparator(name) != null;
        }

        private Goods goodsComparator(String name){
           return iterateGoodsInStorage(shopStorage.getShopAssortment(), eachGood -> eachGood.getName().equals(name));
        }

        @Override
        public String toString() {
            return "ShoppingCart" +
                    goodsList;
        }
    }
}

