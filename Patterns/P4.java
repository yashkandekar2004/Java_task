class P4 {
    void pattern() {
        int a = 1;
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        P4 obj = new P4();
        obj.pattern();
    }
}
