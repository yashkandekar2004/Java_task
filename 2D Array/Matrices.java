import java.util.Scanner;

class Matrices {
    public static boolean search(int matrix[][], int key) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to be searched:");
        key = sc.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("The matrix has a index at position (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("The matrix does not have a index");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for a 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The entered matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 0);
    }
}
