class Solution:
    def minSetSize(self, nums: List[int]) -> int:
        count=Counter(nums)
        freq=dict(count.most_common())
        # print(freq)
        max=0 # 4
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
        print(res)
        return len(res)