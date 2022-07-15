class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums.sort()
        count=1
        ans=[]
        if len(set(nums))==1:
            return 1
        elif len(nums)==1 or len(nums)==0:
            return len(nums)
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                continue
                print(nums[i],nums[i-1])
            elif nums[i]==nums[i-1]+1:
                count+=1
                ans.append(count)
            else:
                ans.append(count)
                count=1
        if len(ans)==0:
            return 0
        return count if count>=max(ans) else max(ans)