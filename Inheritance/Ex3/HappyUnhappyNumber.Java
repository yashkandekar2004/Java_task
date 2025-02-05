class HappyUnhappyNumber extends FibonacciSeries {
    boolean isHappy(int number) {
        while (number != 1 && number != 4) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }
            number = sum;
        }
        return number == 1;
    }

    void checkHappyOrUnhappy(int number) {
        if (isHappy(number)) {
            System.out.println(number + " is a Happy number");
        } else {
            System.out.println(number + " is an Unhappy number");
        }
    }



    public static void main(String[] args) {
        HappyUnhappyNumber obj = new HappyUnhappyNumber();
        
        obj.checkVowelOrConsonant('a');
        
        obj.checkLeapYear(2024);
        
        obj.countDigits(12345);
        
        obj.checkPerfectNumber(6);
        
        obj.displayDiamond(5);
        
        obj.printFibonacci(13);
        
        obj.checkHappyOrUnhappy(4);
    }
}
