class CountDigits extends LeapYear {
    void countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
