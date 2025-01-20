// Approach -1 : Using HashMap
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums){
            if(mp.containsKey(num)){
                mp.put(num, mp.get(num) + 1);
            } else {
                mp.put(num, 1);
            }
        }
        for(int key : mp.keySet()){
            if(mp.get(key) == 1){
                return key;
            }
        }
        return 0;
    }
}

// Approach - 2: Sorting and Traversing
class Solution2 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                continue;
            } else {
                if(i + 1 < nums.length && nums[i] == nums[i+1]){
                    i++;
                } else {
                    return nums[i];
                }
            }
        }
        return nums[0];
    }
}
