package by.epam.jonline.oopbasics.Task_2_Payment;

public class Main {

    public static void main(String[] args) {
        ShopStorage shopStorage = new ShopStorage();
        Payment.ShoppingCart shoppingCart = new Payment.ShoppingCart(shopStorage);
        Wallet wallet = new Wallet(15);
        Payment payment = new Payment(shopStorage,shoppingCart);

        Goods item1 = new Goods("Milk", 2);
        Goods item2 = new Goods("Bread", 1);
        Goods item3 = new Goods("Butter", 4);
        Goods item4 = new Goods("Meat", 9);
        Goods item5 = new Goods("Caviar", 15);

        shopStorage.bringGoods(item1);
        shopStorage.bringGoods(item2);
        shopStorage.bringGoods(item3);
        shopStorage.bringGoods(item4);
        shopStorage.bringGoods(item5);


        shoppingCart.addToCart("Milk");
        shoppingCart.addToCart("Bread");
        shoppingCart.addToCart("Salad");
        shoppingCart.addToCart("Meat");
        shoppingCart.addToCart("Caviar");
        shoppingCart.removeFromCart("Milk");

        payment.countTotalCost();
        payment.pay(wallet);
        payment.printCheck();

        wallet.printWalletBalance();

        payment.printCashBoxBalance();







        }
    }
