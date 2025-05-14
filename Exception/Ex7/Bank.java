public class Bank {

    void withdraw(double amount) throws InsufficientFundException {
        if (amount > 1000) {
            throw new InsufficientFundException("Amount must be less than 1000");
        }else {
            System.out.println("Amount withdrawn successfully");
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        try {
            bank.withdraw(900);
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }


}

