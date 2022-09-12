public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] value = {1,2,3,4};
        ProductofArrayExceptSelf test = new ProductofArrayExceptSelf();
        int[] result = test.productExceptSelf(value);
        print(result);
    }
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] first = new int[length];
        int[] second = new int[length];
        int[] result = new int[length];
        int product = 1;
        for(int x=0;x<length;x++) {
            product *= nums[x];
            first[x] = product;
        }
        print(first);
        product = 1;
        for(int x=length-1;x>0;x--) {
            product *= nums[x];
            second[x] = product;
        }
        print(second);
        for(int x=0;x<length;x++) {
            result[x] = first[x]+first[x];
        }
        return result;
    }
    
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
          System.out.print(arr[i] + " ");
          System.out.println();
      }
}