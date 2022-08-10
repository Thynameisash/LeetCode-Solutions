class Solution:
    def rob(self, nums: List[int]) -> int:
        nlen=len(nums)
        if nlen==0: return 0
        if nlen==1: return nums[0]
        else:
            prev1,prev2,temp=0,0,0
            for i in nums:
                temp=prev1;
                prev1=max(prev2+i,prev1)
                prev2=temp
            return prev1
        
