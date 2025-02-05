public class PayPalPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paying with PayPal: " + amount);
    }
    public void refund(double amount){
        System.out.println("Refunding with PayPal: " + amount);
    }
    
}
