public class Ex7 {
    void replaceString(String str) {
        System.out.println(str.replace('H', 'W'));
    }
    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        ex7.replaceString("Hello");
    }
}
