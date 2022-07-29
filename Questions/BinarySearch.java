public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 10};
        int result = binarySearch(nums, 4);
        System.out.println(result);

    }

    public static int binarySearch(int[] arr, int target) {
        int low =0;
        int high = arr.length;
        while(low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] == target) {
                return mid;
            }
            if(target > arr[mid]) {
                high++;
            } else {
                low--;
            }
        }
        return -1;
    }
}
