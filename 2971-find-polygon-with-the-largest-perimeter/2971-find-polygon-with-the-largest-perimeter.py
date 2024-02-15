class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        nums.sort()
        sum = 0
        ans = -1
        for num in nums:
            if num < sum:
                ans = num + sum
            sum += num
        return ans