package PaymentProcessingSystem;

public class CreditCardPayment implements PaymentStrategy{
    private final String cardNum;
    private double dailyCreditLimit = 500.0;
    private double owedAmount = 0.0;

    public CreditCardPayment(String cardNum){
        this.cardNum = cardNum;
    }

    @Override
    public void pay(double pay){
        if (this.dailyCreditLimit - pay < 0){
            System.out.println("Insufficient Funds");
        } else{
            this.dailyCreditLimit = this.dailyCreditLimit - pay;
            this.owedAmount = this.owedAmount + pay;
        }
    }
}
