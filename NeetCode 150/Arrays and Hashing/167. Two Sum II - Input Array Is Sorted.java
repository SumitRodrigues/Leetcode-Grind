// Using Brute Force

import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] { i + 1, j + 1 };
                }
            }
        }
        return new int[0];
    }
}

// Time & Space Complexity
// Time complexity: 

// O(n2)
// Space complexity: 

// O(1)

// using hashmap

class Solution2 {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        Map<Integer, Integer> ans = new HashMap<>();
        for(int i = 0; i < n; i++){
            int temp = target - numbers[i];
            if(ans.containsKey(temp)){
                return new int[]{ans.get(temp), i+1};
            }
            ans.put(numbers[i], i+1);
        }
        return new int[0];
    }
}
// Time & Space Complexity
// Time complexity: 

// O(n)
// Space complexity: 

// O(n)

//Using two pointers
class Solution3 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int total = numbers[left] + numbers[right];
            if(total == target){
                return new int[]{left+1, right+1};
            }
            else if(total > target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{};
    }
}

// Time & Space Complexity
// Time complexity: 

// O(n)
// Space complexity: 

// O(1)