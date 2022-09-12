import java.util.*;
public class FindDuplicateParenthesis {
    public static class Node {
        private char data;
        private Node next;
        
        Node(char data) {
            super();
            this.data = data;
        }
        public char getData() {
            return data;
        }
        public void setData(char data) {
            this.data = data;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static class Stack {
        Node head;
        public Stack() {
            super();
            head = null;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void push(char data) {
            Node temp = new Node(data);
            temp.setNext(head);
            head = temp;
        }
        public char pop() {
            if (head == null) {
                return '\0';
            }
            char data = head.getData();
            head = head.getNext();
            return data;
        }
        public char peek() 
        { 
            if (!isEmpty()) { 
                return head.data; 
            } 
            else { 
                System.out.println(" "); 
                return '\0';
            } 
        } 
    }
    public static String findDuplicateParenthesis(String inputString) {
		int close = -1;
		//Write your code here
		Stack st = new Stack();
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
		 if(!st.isEmpty()) {
			 return "present";
		 }
		 return "absent";
	 }
    public static void main(String[] args){
        FindDuplicateParenthesis obj = new FindDuplicateParenthesis();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(obj.findDuplicateParenthesis(inputString));
    }
}