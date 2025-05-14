public class SumOfDigits {
    void sumOfDigits() {
        int num = 12345;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }

    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();
        obj.sumOfDigits();
    }
}
