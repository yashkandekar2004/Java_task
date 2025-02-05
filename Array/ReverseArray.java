//write a java program to reverse an array of integer 


public class ReverseArray {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        int[] reverse = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            reverse[num.length - 1 - i] = num[i];
        }

        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
    }
}
