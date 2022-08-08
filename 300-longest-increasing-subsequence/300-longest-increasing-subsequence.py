class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        res=[nums[0]]
        top=1;
        for i in range(1,len(nums)):
            if nums[i]>res[top-1]:
                res.append(nums[i])
                top+=1
            else:
                pos=self.bs(res,nums[i])
                res[pos]=nums[i]
        return len(res)
    
    def bs(seld,res, value):
        s=0
        e=len(res)-1
        while(s<=e):
            m = (s+e)>>1
            if res[m]<value:
                s=m+1
            else:
                e=m-1
        return s
            
            