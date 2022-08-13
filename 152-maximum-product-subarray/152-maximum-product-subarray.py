class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        ans=nums[0]
        maxprod,minprod=ans,ans

        
        for i in range(1,len(nums)):
            if nums[i]<0:
                maxprod,minprod=minprod,maxprod
                
            maxprod=max(nums[i],maxprod*nums[i])
            minprod=min(nums[i],minprod*nums[i])
            ans=max(ans,maxprod)

            
        return ans