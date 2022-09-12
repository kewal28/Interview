import java.util.*;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String a = "tmmzuxt";
        System.out.println("Length Of Longest Substring: " + lengthOfLongestSubstring(a));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> _map = new HashMap<Character, Integer>();
        int max = 0, count = 0;
        for(char c: s.toCharArray()) {
            if(_map.containsKey(c)) {
                int x = _map.get(c);
                count = count-x;
                _map.put(c, count);
            } else {
                _map.put(c, count);
                count = count+1;
            }
            if(count > max) {
                max = count;
            }
        }
        return max;
    }

}