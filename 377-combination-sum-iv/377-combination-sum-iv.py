class Solution:
    def combinationSum4(self, nums: List[int], target: int) -> int:
	
		# Sort the nums to break the loop when total - num becomes negative.
        nums.sort()

		# Allocates the dp table
        dp = [0] * (target + 1)

        # The case total becomes 0 is only 1 (nothing add)
        dp[0] = 1

		# Try the all cases the total from 1 to target
        for currtotal in range(1, target + 1):
		
			# Try all possible numbers.
            for number in nums:
			
                if currtotal - number >= 0:
					# Uses the previous information
                    dp[currtotal] += dp[currtotal - number]
                else:
                    break
        return dp[target]