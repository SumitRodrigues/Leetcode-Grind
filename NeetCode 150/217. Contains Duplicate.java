// Using Brute Force

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

// Time & Space Complexity
// Time complexity: 
// O(n2)

// Space complexity: 
// O(1)

// Using sorting
class Solution2 {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}

// Time & Space Complexity
// Time complexity: 
// O(nlogn)

// Space complexity: 

// O(1) or 
// O(nlogn) depending on the sorting algorithm.

// Using HashSet
public class Solution3 {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

// Time & Space Complexity
// Time complexity: 

// O(n)
// Space complexity: 

// O(n)