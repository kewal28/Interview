import java.util.Stack;

public class RemoveDuplicateAdjacentCharacters {
    public static void main(String[] args) {
        // String result = removeAdjacent("abbaca");
        // System.out.println(result);

        String result = removeDuplicates("abbaca");
        System.out.println(result);
    }



    public static String removeAdjacent(String S) {
        if(S.length()<2) {
            return S;
        }
        String substr = "";
        for(int i=0; i<S.length()-1; i++) {
            if(S.charAt(i) == S.charAt(i+1)) {
                // System.out.println(S.charAt(i) + " "+ S.charAt(i+1));
                substr = S.substring(0, i) + S.substring(i+2, S.length()); 
                // System.out.println(substr);
                return removeAdjacent(substr);
            }
        }
        return S;
    }

    public static String removeDuplicates(String S) {
        if(S.length()<2) {
            return S;
        }
        Stack<Character> stack = new Stack<>();
        stack.push(S.charAt(0));
        for(int i=1; i<S.length(); i++) {
            if(!stack.isEmpty() && S.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }
        String string = "";
        while(!stack.isEmpty()) {
            string = stack.pop()+string;
        }
        return string;
    }

}
