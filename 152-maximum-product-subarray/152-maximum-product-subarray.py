class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        ans=nums[0]
        maxa,mina=ans,ans

        
        for i in range(1,len(nums)):
            if nums[i]<0:
                maxa,mina=mina,maxa
                
            maxa=max(nums[i],maxa*nums[i])
            mina=min(nums[i],mina*nums[i])
            ans=max(ans,maxa)

            
        return ans