public class RecursiveReverseInt {

    public static void main(String[] args) {
        System.out.println("Reverse number: ");
        reverse(86878);
    }

    public static void reverse(int num) {
        if (num < 10) {
            System.out.println(num);
            return;
        } else {
            if(num % 10 != 0) {
                // print the unit digit of the given number
                System.out.print(num % 10);
            }
 
            // calling function for remaining number other
            // than unit digit
            reverse(num / 10);
        }
    }
}
