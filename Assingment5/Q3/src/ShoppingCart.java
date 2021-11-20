import java.util.LinkedList;

public class ShoppingCart {
    LinkedList<Item> cart;

    public ShoppingCart(){
        cart = new LinkedList<>();
    }

    public void addItem(Item item){
        cart.add(item);
    }

    public void removeItem(Item item){
        cart.remove(item);
    }

    public int calculateTotal(){
        int total = 0;
        for(int i = 0; i < cart.size(); i++){
            total += cart.get(i).price;
        }
        return total;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(this.calculateTotal());
    }
}
