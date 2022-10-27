package by.epam.jonline.oopbasics.Task_2_Payment;

public class Wallet {
    private int money;

    Wallet(int money){
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void printWalletBalance(){
        System.out.println("Your wallet balance now is : " + getMoney());
    }
}
