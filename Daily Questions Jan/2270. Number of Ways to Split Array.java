class Solution1{
    public int waysToSplitArray(int[] nums){
        int n = nums.length;
        int splitCount = 0;
        long leftCount = 0;
        long rightCount;
        long totalSum = 0;

        for(int num : nums){
            totalSum += num;
        }

        for(int i = 0; i < n-1; i++){
            leftCount += nums[i];
            rightCount = totalSum - leftCount;

            if(leftCount >= rightCount){
                splitCount++;
            }
        }
        return splitCount;
    }
}