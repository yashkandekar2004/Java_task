public class CreditCardPayment implements Payment{

    public void pay(double amount){
        System.out.println("Paying with credit card: " + amount);
    }
    public void refund(double amount){
        System.out.println("Refunding with credit card: " + amount);
    }
}