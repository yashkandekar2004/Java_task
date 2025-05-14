public class ReverseNumber {

    void reverse() {
        int num = 12345;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }

    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        obj.reverse();
    }
}
