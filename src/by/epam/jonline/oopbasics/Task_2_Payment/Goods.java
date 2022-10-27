package by.epam.jonline.oopbasics.Task_2_Payment;

public class Goods {
    private String name;
    private int price;

    Goods(){
    }

    Goods(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return
                "{name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
