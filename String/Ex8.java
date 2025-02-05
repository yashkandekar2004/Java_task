public class Ex8 {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] charArray = str.toCharArray();
        
        System.out.println("The character array is:");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
    }
}
