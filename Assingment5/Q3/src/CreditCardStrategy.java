public class CreditCardStrategy implements PaymentStrategy{
    public String cardNumber;

    public CreditCardStrategy(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int num) {
        System.out.println("CreditCard: $" + num);
    }
}
