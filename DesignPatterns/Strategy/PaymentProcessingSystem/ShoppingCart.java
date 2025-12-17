package PaymentProcessingSystem;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public double calculateTotal(){
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void setPaymentStratey(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(){
        this.paymentStrategy.pay(this.calculateTotal());
    }
}
