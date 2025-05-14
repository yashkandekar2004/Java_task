class Armstrong {
    void printArmstrongNumbers(int n) {
        for (int number = 1; number <= n; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }

    boolean isArmstrong(int number) {
        int temp = number, sum = 0;
        int digits = String.valueOf(number).length();

        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String args[]) {
        Armstrong obj = new Armstrong();
        int n = 1000; 
        obj.printArmstrongNumbers(n);
    }
}
