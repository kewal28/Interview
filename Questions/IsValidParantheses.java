import java.util.Stack;

public class IsValidParantheses {
    public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		String value = "({}[])[]";
		// System.out.println(value.charAt(0));
		System.out.println(isValidParantheses(value));
	}

	public static boolean isValidParantheses(String brackets) {
		Stack<Character> st = new Stack<>();
		//Write your code here 
		for(int x=0; x<brackets.length(); x++) {
			if(brackets.charAt(x) == '(' || brackets.charAt(x) == '{' || brackets.charAt(x) == '[') {
				st.push(brackets.charAt(x));
				st.peek();
			} else {
				if(st.peek() == '(' && brackets.charAt(x) == ')') {
					st.pop();
				} else if(st.peek() == '{' && brackets.charAt(x) == '}') {
					st.pop();
				} else if(st.peek() == '[' && brackets.charAt(x) == ']') {
					st.pop();
				} else {
					return false;
				}
			}
		}
		if(!st.empty()) {
			return false;
		}
		return true;
	  }
}
