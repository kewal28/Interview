public class ArrayPartition {
    
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        int secodnHigh = arrayPairSum(nums);
        // System.out.println(secodnHigh);
    }

    public static int arrayPairSum(int[] nums) {
        int low = 0;
        int high = 1;
        int out = -1;
        while(low>=high) {
            min(nums[low], nums[high]);
        }
        return out;
    }

    public static int min(int x,int y) {
        return (x>y) ? y : x;
    }
}
