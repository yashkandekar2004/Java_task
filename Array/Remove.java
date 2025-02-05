public class Remove {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int remove = 30;
        int[] result = new int[arr.length - 1];
        int index = 0;
 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != remove) {
                result[index] = arr[i];
                index++;
            }
        }
 
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
 
 