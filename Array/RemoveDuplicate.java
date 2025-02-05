import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int length = array.length;

        int[] temp = new int[length];
        int j = 0;

        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[length - 1];

        int[] newArray = Arrays.copyOf(temp, j);

        System.out.println("Array after removing duplicates: " + Arrays.toString(newArray));
    }
}
