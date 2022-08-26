class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        if len(nums)==1: return
        if len(set(nums)) ==1: return
        flag =0
        for i in range(len(nums)-1,0,-1):
            if nums[i-1]<nums[i]:
                numindex=i-1
                flag=1
                break
            # elif nums[i-1]==nums[0]:
            #     nums.sort()
            #     return
        print(flag)
        if flag==0: 
            nums.sort()
            return
            
        print(nums[numindex])
        mindif=inf
        for j in range(numindex,len(nums)):
            if nums[j]>nums[numindex]:
                if nums[j]-nums[numindex]<=mindif:
                    mindif=nums[j]-nums[numindex]
                    greaternum=j
        nums[numindex],nums[greaternum]=nums[greaternum],nums[numindex]

        start=numindex+1
        end=len(nums)-1

        while start<=end:
            nums[start],nums[end]=nums[end],nums[start]
            start+=1
            end-=1


                