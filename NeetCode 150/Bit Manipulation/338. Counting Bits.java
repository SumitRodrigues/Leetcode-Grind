// Using Bit Manipulation -1 method

class Solution1 {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int num = 1; num <= n; num++) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    res[num]++;
                }
            }
        }       
        return res;
    }
}

// Time & Space Complexity
// Time complexity: 
// O(n)
// Space complexity: 
// O(1)
