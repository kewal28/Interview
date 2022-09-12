public class ReverseString {

    public static void main(String[] args) {
        String str = "apple";
        String result = reverse(str);
        System.out.println(result);
        System.out.println();
        char[]  c = {'h','e','l','l','o'};
        reverseString(c);
        System.out.println();
    }

    public static String reverse(String str) {
        String out = "";
        for(int x = str.length()-1; x >= 0; x--) {
         out = out + str.charAt(x);
        }
        return out;
    }

    public static void reverseString(char[] s) {
        int low = 0;
        int high = s.length-1;
        while(low<high) {
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
        _print(s);
    }

    public static void _print(char[] res) {
        for(int i=0; i<res.length; i++) {
            if(i == res.length - 1) {
                System.out.print(res[i]);
            } else {
                System.out.print(res[i] + " ");
            }
        }
    }
}
