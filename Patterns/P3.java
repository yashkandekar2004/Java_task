class P3 {
    void pattern() {

        for (int i = 1; i <= 5; i++) {
            char letter = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(letter);
                letter++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        P3 obj = new P3();
        obj.pattern();
    }
}
