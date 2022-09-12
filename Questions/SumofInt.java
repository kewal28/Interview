public class SumofInt {

    public static void main(String[] args) {
        int nums = 492;
        int result = sum(nums);
        System.out.println(result);

    }

    public static int sum(int num) {
        if (num == 0)
            return 0;
        return (num % 10 + sum(num / 10));
    }
}
