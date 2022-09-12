import java.util.*;

// import com.apple.laf.resources.aqua_zh_CN;


public class Test {


    public static void merge(int[] arr,int start, int end, int k){
        //write your code here
        int count = 0;
        for(int i =0; i<end;i++) {
            
        }
      }

    public static void arrangeEvenOdd(int[] arr) {
        int[] ans = new int[arr.length];
        int start =0;
        int end = arr.length-1;
        while(start< end) {
            if(arr[start]%2 ==0) {
                System.out.println(arr[start]);
                ans[start] = arr[start];
                start++;
            } else {
                ans[end] = arr[end];
                end--;
            }
        }
        // for(int x=0; x<arr.length; x++) {
        //     if(arr[x]%2 ==0) {
        //         System.out.println(arr[x]);
        //         ans[start] = arr[x];
        //         start++;
        //     } else {
        //         ans[end] = arr[x];
        //         end--;
        //     }
        // }
        for(int x=0; x<ans.length; x++) {
            arr[x] = ans[x];
            System.out.println(arr[x]);
        }
    }

      // Function to print in spiral order
    public static int[] generateSpiralMatrix(int[][] matrix) {
        int[] ans = new int[matrix.length*matrix.length];
  
        if (matrix.length == 0)
            return ans;
  
        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;
  
        // Iterate from 0 to R * C - 1
        for (int i = 0; i < m * n; i++) {
            ans[i] = matrix[x][y];
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];
  
            if (0 <= cr && cr < m && 0 <= cc && cc < n
                    && !seen[cr][cc]) {
                x = cr;
                y = cc;
            } else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
          System.out.print(arr[i] + " ");
          System.out.println();
      }
  
    // Driver Code
    public static void main(String[] args) {

        // int result = lengthOfLongestSubstring("bbbbbbb");
        // int result = lengthOfLongestSubstring("abcabcbb");
        // int result = lengthOfLongestSubstring("tmmzuxt");
        // System.out.println(result);

        char c = 'x';
       c++;
       c++;
       System.out.println(c);
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> _map = new HashMap<Character, Integer>();
        int max = 0, count = 0;
        for(char c: s.toCharArray()) {
            if(_map.containsKey(c)) {
                int x = _map.get(c);
                count = count+1;
                count = count-x;
                System.out.println("Char "+ c + " If "+count);
                _map.put(c, count);
            } else {
                count = count+1;
                System.out.println("Char "+ c + " Esle "+count);
                _map.put(c, count);
            }
            if(count > max) {
                max = count;
            }
            // cnt++;
        }
        return max;
    }

    // function permute(nums) {
    //     let result = [];if (nums.length === 0) return [];
    //     if (nums.length === 1) return [nums];for (let i = 0; i < nums.length; i++) {
    //       const currentNum = nums[i];
    //       const remainingNums = nums.slice(0, i).concat(nums.slice(i + 1));
    //       const remainingNumsPermuted = permute(remainingNums);  for (let j = 0; j < remainingNumsPermuted.length; j++) {    }
    //     }
    //     return result;
    //   }

    private static boolean isSafePlace(int column, int Qi, int[] board) {
        //check for all previously placed queens
        for (int i = 0; i < Qi; i++) {
            if (board[i] == column) { // the ith Queen(previous) is in same column
                return false;
            }
        //the ith Queen is in diagonal
        //(r1, c1) - (r2, c1). if |r1-r2| == |c1-c2| then they are in diagonal
            if (Math.abs(board[i] - column) == Math.abs(i - Qi)) {
                return false;
            }
        }
        return true;
    }

    public static boolean check24(int[] a) {
        int makeValue = 0;
        int valueKey = -1;
        for(int i =0; i< a.length; i++) {
            int value = checkValue(a[i]);
            if(value != -1) {
                valueKey = i;
                makeValue = checkKey(value);
                break;
            }
        }

        System.out.println(makeValue +" Key "+ valueKey);
        return false;
    }

    public static int checkValue(int a) {
        if(a == 6) return 6;
        if(a == 4) return 4;
        if(a == 8) return 8;
        if(a == 3) return 3;
        return -1;
    }

    public static int checkKey(int a) {
        if(a == 6) return 4;
        if(a == 4) return 6;
        if(a == 8) return 3;
        if(a == 3) return 8;
        return -1;
    }

    static int recursiveSumDigits(int n){
        if (n == 0) {
            return 0;
        }
        boolean start = true;
        int sum = 0;
        while(start) {
            sum += (n % 10);
            n = n/10;
            if(n == 0) {
                start = false;
            }
        }
        if(sum > 9) {
            return recursiveSumDigits(sum);
        }
        return sum;
    }

    public static int product(int[] nums , int fwdProduct, int index) {
        int revProduct = 1;

        if (index < nums.length) {
            revProduct = product(nums, fwdProduct * nums[index], index + 1);

            int cur = nums[index];
            nums[index] = fwdProduct * revProduct;
            revProduct *= cur;
        }

        return revProduct;
    }

    static void findRepeatingAndMissing(int[] arr, int size) {
        HashSet<Integer> map = new HashSet<Integer>();
        int repeat = 0;
        int mis = 0;
        for(int x=0; x< size; x++) {
            if(!map.contains(arr[x])) {
                map.add(arr[x]);
            } else {
                repeat = arr[x];
            }
        }
        for(int x=0; x< size; x++) {
            if(!map.contains(x)) {
                mis = x;
            }
        }
        System.out.println("Repeating no is : ["+repeat+"]");
        System.out.println("Missing number is : ["+mis+"]");
    }

    public static void rotate90Clockwise(int[][] a) {
        int N = a.length;
        for (int i = 0; i < N / 2; i++)
    {
        for (int j = i; j < N - i - 1; j++)
        {
 
            // Swap elements of each cycle
            // in clockwise direction
            int temp = a[i][j];
            a[i][j] = a[N - 1 - j][i];
            a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
            a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
            a[j][N - 1 - i] = temp;
        }
    }
        // return arr;
      }

      static void printArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static boolean subArraySum(int arr[]) {
        HashSet<Integer> map = new HashSet<Integer>();
        int sum = -1;
        for(int x = 0; x< arr.length; x++) {
            if(arr[x] == 0) {
                return true;
            }
            sum += arr[x];
            if(map.contains(sum)) {
                return true;
            }
            map.add(sum);
        }
        return false;
    }
      
    //   public static void main(String[] args) {
    //     int k;
    //     k = 2;
    //     int[] arr = {1,1,5,6,3,5,9,4,6,1};
    //     //write your code here
    //     int start = 0;
    //     int end = arr.length;
    //     // int[] arr1 = new int[n];
    //     merge(arr,start, end, k);
    //   }

    // public static void main(String[] args) {
    //     int[] ints = {1,1,5,6,3,5,9,4,6,1};

    //     int ans = firstNonRepeating(ints);
    //     if(ans ==0) {
    //         System.out.println("All Match");
    //     } else {
    //         System.out.println(ans);
    //     }
    // }

    static int firstNonRepeating(int arr[])  { 
      HashMap<Integer, Integer> list1 = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(list1.containsKey(arr[i])) {
                int count = list1.get(arr[i]);
                count = count+1;
                list1.put(arr[i], count);
            } else {
                list1.put(arr[i], 1);
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(list1.containsKey(arr[i])) {
                int count = list1.get(arr[i]);
                if(count == 1) {
                    return arr[i];
                }
            }
        }
        return 0;
  }
//     fun(5) = 1 + fun(1) * fun(4) + fun(2) * fun(3) + fun(3) * fun(2) + fun(4) * fun(1)  = 1 + 2*[fun(1)*fun(4) + fun(2)*fun(3)]
// Substituting fun(1) = 1  = 1 + 2*[fun(4) + fun(2)*fun(3)]
// Calculating fun(2), fun(3) and fun(4)
// fun(2) = 1 + fun(1)*fun(1) = 1 + 1*1 = 2
// fun(3) = 1 + 2*fun(1)*fun(2) = 1 + 2*1*2 = 5
// fun(4) = 1 + 2*fun(1)*fun(3) + fun(2)*fun(2)  = 1 + 2*1*5 + 2*2 = 15
// Substituting values of fun(2), fun(3) and fun(4)
// fun(5) = 1 + 2*[15 + 2*5] = 51 

public static void print(String var1, int var2) {
    for (int i = 0; i < var2; i++) {
        System.out.println(var1 + " " + i);
    }
}

public static void NumberPattern(String args[]) { 
    int s1 = 0;
    int s2 = 17;
    int i, j, k;
    int firstOfRow = -1;
    for (i = 4; i > 0; i--) {
        for (j = 0; j < i; j++) {
            if (j > 0) {
                System.out.print("*" + ++s1);
            } else {
                System.out.print(" " + ++s1);
            }
        }
        for (k = 0; k < i; k++) {
            if (k == 0) {
                if (i == 4)
                    firstOfRow = s2;
                else {
                    firstOfRow = firstOfRow - i - i - 1;
                }
            }
            System.out.print("*" + firstOfRow++);
        }
        System.out.println();
    }
}

    
    public static int mostVotes(int[] votes) {
        int maxVotesIndex = 0;
        int maxVotes = votes[0];
        for(int x=1;x<votes.length; x++) {
            if(votes[x] > maxVotes) {
                maxVotes = votes[x];
                maxVotesIndex = x;
            }
        }
        return maxVotesIndex;
    }
 
//  public static void main(String[] args)  
//  {  
//      // create ArrayList list1
//      int[] nums = {1, 2, 3, 4, 5, 10};
//      findRepeatedNumber(nums, nums.length);

//  } 

 public static int findRepeatedNumber(int[] arr, int n) {
    ArrayList<Integer> list1 = new ArrayList<>();
    for(int i = 0; i < n; i++) {
        if(list1.contains(arr[i])) {
            return arr[i];
        }
        list1.add(arr[i]);
    }

    return -1;
  }

    // public static void main(String[] args) {
    //     // int res = _sum(3, 5);
    //     int res  = longestDistance("The India is my a country.");
    //     System.out.println(res);
    // }

    public static int longestDistance(String s) {
        int first = 0;
        int maxHigest = 0;
        char _char;
        int second = s.length()-1;
        while(first < s.length()-1) {
            if(s.charAt(first) == s.charAt(second)) {
                if(maxHigest < second) {
                    _char = s.charAt(first);
                    System.out.println(_char);
                    maxHigest = second;
                }
                first++;
                // second = s.length()-1;
            } else {
                second--;
            }
        }
        return maxHigest;
      }



    public static int atoi(String s, int length) {
        for(char c: s.toCharArray()) {
            if(Character.getNumericValue(c) >= 10) {
                return -1;
            }
        }
        return Integer.parseInt(s);
      }

    static int total = 0;
    static int _sum(int n, int sum) {
        if(n == 1 && sum >= 0) {
            return  sum;`
        }
        total += _sum(n-1, sum);
        return total;
    }


    // public String isSubset( long a1[], long a2[], long n, long m) {
    //     Map<Integer, Integer> _map = new HashSet();
    //     for(int p=0; p < n; p++) {
    //         System.out.print(a1[p]);
    //          _map.add(a1[p], p);
    //     }
    //     for(int p=0; p < m; p++) {
    //         if(!_map.get(a2[m])) {
    //             return false;
    //         }
    //     }
    //     return true;
        
    // }

    // public static void main(String[] args) {
    //     int[] nums = {42, 67, 82, 33, 70, 32, 66, 26, 64, 69};
    //     int high = 0;
    //     int secodnHigh = 0;
    //     high = nums[0];
    //     secodnHigh = nums[0];
    //     for (int i = 1; i < nums.length; i++) {
    //         if(nums[i] > high) {
    //             high = nums[i];
    //         } 
    //         if(nums[i] > secodnHigh &&  nums[i] != high) {
    //             secodnHigh = nums[i];
    //         }
    //     }
    //     System.out.println(high);
    //     System.out.println(secodnHigh);
    //     removeAdjacent("76576hjagsjhdgash765");
    // }

    // public static String removeAdjacent(String str) {
    //     for(char c: str.toCharArray()) {
    //         if(str.charAt(c-1)==c) {
    //             str = str.substring(0, c-1);
    //             break;
    //         }
    //     }
    //     return removeAdjacent(str);
    //   //Write your code here
    // }
}
