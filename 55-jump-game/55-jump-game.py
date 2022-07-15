class Solution:
    def canJump(self, nums: List[int]) -> bool:
        nlen=len(nums)
        post=nlen-1
        flag=0
        for i in range(nlen-1,-1,-1):
            if i+nums[i]>=post:
                post=i
                flag=1
            else:
                flag=0
                continue
        return flag