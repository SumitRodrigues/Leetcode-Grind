# Using DP recursion method
from typing import List


class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        if sum(nums) % 2:
            return False
        
        dp = set()
        dp.add(0)
        target = sum(nums) // 2

        for i in range(len(nums) - 1, -1, -1):
            nextDP = set()
            for t in dp:
                nextDP.add(t + nums[i])
                nextDP.add(t)

            dp = nextDP

        return True if target in dp else False
    

# using DP Top-bottom approach
class Solution2:
    def canPartition(self, nums: List[int]) -> bool:
        total = sum(nums)
        if total % 2:
            return False
        
        target = total // 2
        n = len(nums)

        memo = [[-1] * (target + 1) for _ in range(n + 1)]

        def dfs(i, target):
            if target == 0:
                return True
            if i >= n or target < 0:
                return False
            if memo[i][target] != -1:
                return memo[i][target]
            
            memo[i][target] = (dfs(i + 1, target) or dfs(i + 1, target - nums[i]))

            return memo[i][target]
        
        return dfs(0, target)
