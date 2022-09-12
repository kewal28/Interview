public class RecursiveFactorial {

    public static void main(String[] args) {
        System.out.println("Factorial number: " + factorial(5));
    }

    public static long factorial(int n) {
        if(n >= 1) {
            // System.out.println(n);
            return n*factorial(n-1);
        } else {
            return 1;
        }
    }
}
