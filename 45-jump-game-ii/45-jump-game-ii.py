class Solution:
    def jump(self, nums: List[int]) -> int:
        curr=0
        jumps=0
        maxx=0
        nlen=len(nums)-1
        for i in range(nlen):
            if i+nums[i]>=maxx:
                maxx=i+nums[i]
            if i==curr:
                jumps+=1
                curr=maxx
        return jumps