import java.util.*;
// Using brute force

class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> store = new HashSet<>();
        for(int num : nums){
            store.add(num);
        }

        for(int num : nums){
            int streak = 0, curr = num;
            while(store.contains(curr)){
                streak++;
                curr++;
            }
            res = Math.max(res, streak);
        }
        return res;
    }
}

// Time & Space Complexity
// Time complexity: 

// O(n 2)
// Space complexity: 

// O(n)

//Using Sorting

class Solution2 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 0, curr = nums[0], streak = 0, i = 0;

        while (i < nums.length) {
            if (curr != nums[i]) {
                curr = nums[i];
                streak = 0;
            }
            while (i < nums.length && nums[i] == curr) {
                i++;
            }
            streak++;
            curr++;
            res = Math.max(res, streak);
        }
        return res;
    }
}

// Time & Space Complexity
// Time complexity: 

// O(nlogn)
// Space complexity: 

// O(1)