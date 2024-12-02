//1. Bit Mask - I

class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            if((1 << i & n) != 0){
                res++;
            }
        }
        return res;
    }
}

// Time & Space Complexity
// Time complexity: 

// O(1)
// Space complexity: 

// O(1)


