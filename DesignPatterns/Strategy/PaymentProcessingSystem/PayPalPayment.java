package PaymentProcessingSystem;

public class PayPalPayment implements PaymentStrategy{
    private final String email;
    private String password;
    private double balance = 750.0;

    public PayPalPayment(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        if (balance < 0){
            System.out.println("Insufficient Funds");
        } else {
            this.balance = this.balance - amount;
        }
    }
}
