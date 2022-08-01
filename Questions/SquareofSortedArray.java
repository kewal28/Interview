public class SquareofSortedArray {

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] res = square(nums);
        _print(res);
    }

    public static int[] square(int[] nums) {
        int n = nums.length;
        int right = n-1;
        int left = 0;
        int[] _return = new int[n];
        for(int x=n-1;x>=0; x--) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                _return[x] = Math.abs(nums[left])*Math.abs(nums[left]);
                left++;
            } else {
                _return[x] = Math.abs(nums[right])*Math.abs(nums[right]);
                right--;
            }
        }
        return _return;
    }

    public static void _print(int[] res) {
        for(int i=0; i<res.length; i++) {
            if(i == res.length - 1) {
                System.out.print(res[i]);
            } else {
                System.out.print(res[i] + " ");
            }
        }
    }
}
