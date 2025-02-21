// Approach - 1 : Using HashMap
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int[] res = new int[2];
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                res[index++] = entry.getKey();
                if (index == 2) break;
            }
        }
        return res;
    }
}