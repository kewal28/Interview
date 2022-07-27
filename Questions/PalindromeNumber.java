public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("Palindrome number: " + isPalindrome(123));
    }

    public static boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        int first = 0;
        boolean isPalindrome = false;
        int last = temp.length()-1;

        for (int i = 0; i < temp.length(); i++) {
            if(temp.charAt(first) == temp.charAt(last)) {
                first++;
                last--;
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
