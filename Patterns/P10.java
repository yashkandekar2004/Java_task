class P10 {
    void pattern() {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        P10 obj = new P10();
        obj.pattern();
    }
}