public class P8 {
    public static void main(String[] args) {
        int rows = 7;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 15; j++) {

                if ((i == 1 && j == 1) ||
                        (i == 2 && j == 5) ||
                        (i == 3 && (j == 1 || j == 9)) ||
                        (i == 4 && (j == 3 || j == 7)) ||
                        (i == 5 && j == 1) ||
                        (i == 6 && j == 6) ||
                        (i == 7 && j == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
