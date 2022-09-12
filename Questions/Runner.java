import java.util.Stack;

class Runner {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		int[] arr = {1, 3, 2, 4};
		// System.out.println(value.charAt(0));
		System.out.println(findDuplicateParenthesis("(({a+b})) + c)"));
	}

	private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
          System.out.print(arr[i] + " ");
          System.out.println();
      }

	  public static String findDuplicateParenthesis(String inputString) {
		int close = -1;
		//Write your code here
		Stack<Character> st = new Stack<>();
		 //Write your code here 
		 for(int x=0; x<inputString.length(); x++) {
			 if(inputString.charAt(x) == '(' || inputString.charAt(x) == '{' || inputString.charAt(x) == '[') {
				 st.push(inputString.charAt(x));
				 close = 0;
			 } else {
				 if(close == 0 && st.peek() == '(' && inputString.charAt(x) == ')') {
					 st.pop();
					 close = 1;
				 } else if(close == 0 && st.peek() == '{' && inputString.charAt(x) == '}') {
					 st.pop();
					 close = 1;
				 } else if(close == 0 && st.peek() == '[' && inputString.charAt(x) == ']') {
					 st.pop();
					 close = 1;
				 }
			 }
		 }
		 if(!st.empty()) {
			 return "present";
		 }
		 return "absent";
	 }


  }
