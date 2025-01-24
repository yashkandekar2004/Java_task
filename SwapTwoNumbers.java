class SwapTwoNumbers {
    public static void main(String args[]) {
        // 1 Logic
        // int a = 5 ,b = 7;
        // System.out.println("Before swapping: a = " + a + ", b = " + b);
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("After swapping: a = " + a + ", b = " + b);

        // 2 Logic
        int a = 10, b = 6;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);

    }

}
