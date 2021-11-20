public class PayPalStrategy implements PaymentStrategy{
    public String email;

    public PayPalStrategy(String email){
        this.email = email;
    }
    @Override
    public void pay(int num) {
        System.out.println("Paypal: $" + num);
    }
}
