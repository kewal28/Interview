public class CheckPrime {

    public static void main(String[] args) {
        int[] nums = {42, 67, 82, 33, 25, 32, 66, 26, 64, 69};
        int[] res = checkPrime(nums);
        _print(res);
    }

    public static int[] checkPrime(int[] arr) {
      int[] rtn = new int[arr.length];
      for(int p=0; p < arr.length; p++) {
          if(arr[p]==0||arr[p]==1) {
            rtn[p] = 0;
          } else {
              int flag = 1;
              for (int i = 2; i <= arr[p]/2; i++)
               {
                  if (arr[p] % i == 0) {
                    flag = 0;
                  }
               }
               rtn[p] = flag;
          }
      }
      return rtn;
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
