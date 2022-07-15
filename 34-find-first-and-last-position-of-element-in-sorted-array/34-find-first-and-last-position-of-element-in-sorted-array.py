class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        start1, end1 ,start2, end2, res1, res2 =0, len(nums)-1, 0, len(nums)-1, -1, -1
        res=[]
        if target not in nums:
            return [-1,-1]
        if len(nums)==1:
            return [0,0]
        elif len(nums)==2:
            if target==nums[0] and target==nums[1]:
                return [0,1]
            elif target==nums[0] :
                if target==nums[1]:
                    return[0,1]
                else:
                    return[0,0]
            elif target==nums[1] :
                if target==nums[0]:
                    return[1,0]
                else:
                    return[1,1]
        for i in range (len(nums)):
            mid1=int((start1+end1)/2)
            if nums[mid1]==target:
                res1=mid1
                end1=mid1-1
            elif nums[mid1]>target:
                end1=mid1-1
            else:
                start1=mid1+1    
        for i in range (len(nums)):
            mid2=int((start2+end2)/2)
            if nums[mid2]==target:
                res2=mid2
                start2=mid2+1
            elif nums[mid2]>target:
                end2=mid2-1
            else:
                start2=mid2+1
        res.append(res1)
        res.append(res2)
        return res