class Ex3{
    void checkPalidrome(){
        String str = "madam";
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        Ex3 obj = new Ex3();
        obj.checkPalidrome();
    }
}
