public class FindPeek {

    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 8};
        int result = findPeek(nums);
        System.out.println(result);

    }

    public static int findPeek(int[] arr) {
        for(int x=1;x<arr.length-1; ++x) {
            if(arr[x-1] < arr[x] && arr[x+1] < arr[x]) {
                return arr[x];
            }
        }
        return -1;
    }
}
