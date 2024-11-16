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