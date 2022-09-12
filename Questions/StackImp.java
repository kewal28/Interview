import java.util.*;

class StackI {
    int top;
    private int arr[];

    StackI(int capacity) {
        arr = new int[capacity];
        top = -1;
    }
    void push(int val) {
      //Write your push logic here 
      if(top == arr.length-1) {
          System.out.println("Stack Overflow");
      } else {
          top++;
          this.arr[top] = val;
      }
    }
    
    int pop() {
      //Write your pop logic here 
      if(top == -1) {
          return -1;
      } else {
          int val = this.arr[top];
          top--;
          return val;
      }
    }
    
    int peek() {
      if(top == -1) {
          return -1;
      } else {
          return this.arr[top];
      }
    }
    
    int size() {
      if(top == -1) {
          return 0;
      } else {
          return top+1;
      }
    }
}
// Class name should be "Source",
// otherwise solution won't be accepted
public class StackImp {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
    int maxCap = sc.nextInt();
    int querySize = sc.nextInt();
    StackI stack = new StackI(maxCap);
    ArrayList<Integer> result = new ArrayList<>();
    while(sc.hasNextLine() && querySize >= 0) {
        String[] cmd = sc.nextLine().split(" ");
        if(cmd[0].equals("push")) {
            stack.push(Integer.parseInt(cmd[1]));
        } else if(cmd[0].equals("peek")) {
            result.add(stack.peek());
        } else if(cmd[0].equals("pop")) {
            result.add(stack.pop());
        } else if(cmd[0].equals("size")) {
            result.add(stack.size());
        }
        querySize--;
    }
    for(int item: result) {
        System.out.println(item);
    }
	}
}