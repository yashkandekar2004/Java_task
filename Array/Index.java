//write a java program to find index of the array element


public class Index {
    public int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Index indexObj = new Index();  
        int[] array = {1, 2, 3, 4, 5};
        int value = 3;
        int index = indexObj.indexOf(array, value);  
        System.out.println("Index of " + value + " is: " + index);
    }
}
