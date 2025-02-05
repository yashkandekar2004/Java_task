public class Test {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(100);
        payment.refund(100);

        payment = new PayPalPayment();
        payment.pay(100);
        payment.refund(100);
    }
}
