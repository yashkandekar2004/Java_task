public class ReverString {
    void reversedString() {
        String str = "Hello World";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed String: " + reversed);
    }

    public static void main(String[] args) {
        ReverString obj = new ReverString();
        obj.reversedString();
    }
}
