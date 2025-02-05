//write a java program to insert an element into array at specific position


public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        int element = 25;
        int position = 3; 
        
        int[] newArr = new int[arr.length + 1];
        
        for (int i = 0; i < position - 1; i++) {
            newArr[i] = arr[i];
        }
        
        newArr[position - 1] = element;
        
        for (int i = position; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
