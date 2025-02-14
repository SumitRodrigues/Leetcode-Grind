// Brute Force using for loop
class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            if(nums[i] % 2 == nums[i + 1] % 2){
                return false;
            }
        }
        return true;
    }
}

// Using while loop and two pointers
class Solution2 {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length == 0) return false;
        if (nums.length == 1) return true;

        int i = 0, j = 1;
        while(i < j && j < nums.length){
            if((nums[i] + nums[j]) % 2 == 0){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}