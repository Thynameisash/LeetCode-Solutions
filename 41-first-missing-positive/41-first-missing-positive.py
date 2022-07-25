class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        n=1
        nums=set(nums)
        while n in nums: n+=1
        return n
                