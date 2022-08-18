class Solution:
    def minSetSize(self, nums: List[int]) -> int:

        freq=dict(Counter(nums).most_common())

        max=0
        res=[]
        for k,v in freq.items():
            if freq[k]>=len(nums)>>1:
                res.append(k)
                break;
            elif freq[k]+max>=len(nums)>>1:
                res.append(k)
                break;
            else:    
                max+=freq[k]
                res.append(k)

        return len(res)