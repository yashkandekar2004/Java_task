public class Ex4 {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuffer stringBuffer = new StringBuffer("Hello");

        if (str.contentEquals(stringBuffer)) {
            System.out.println("The String and StringBuffer are equal.");
        } else {
            System.out.println("The String and StringBuffer are not equal.");
        }
    }
}
