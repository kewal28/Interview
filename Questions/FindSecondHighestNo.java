public class FindSecondHighestNo {
    
    public static void main(String[] args) {
        int[] nums = {42, 67, 82, 33, 70, 32, 66, 26, 64, 69};
        int secodnHigh = findSecondHighestNo(nums);
        System.out.println(secodnHigh);
    }

    public static int findSecondHighestNo(int[] nums) {
        int high = 0;
        int secodnHigh = 0;
        high = nums[0];
        secodnHigh = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > high) {
                high = nums[i];
            } 
            if(nums[i] > secodnHigh &&  nums[i] != high) {
                secodnHigh = nums[i];
            }
        }
        return secodnHigh;
    }
}
