import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 9, 11, 7};
        int[] result = twoSum(nums, 9);
        System.out.println(result[0]  + " " + result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> _map = new HashMap();
        int[] _return = new int[2];
        for(int p=0; p < nums.length; p++) {
            int requiredValue = target-nums[p];
            if(_map.containsKey(requiredValue)) {
                _return[0] = _map.get(requiredValue);
                _return[1] = p;
                return _return;
            }
            _map.put(nums[p], p);
        }
        return _return;
    }
}
