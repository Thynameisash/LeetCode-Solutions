class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res=[]
        visited=[False]*len(nums)
        print(visited)
        def bt(res,curr,nums,visited):
            if len(curr)==len(nums):
                res.append(curr.copy())
                return
                
            for i in range(len(nums)):
                if visited[i]==True: continue
                curr.append(nums[i])
                visited[i]=True
                bt(res,curr,nums,visited)
                visited[i]=False
                curr.pop()
                    
        bt(res,[],nums,visited)
        return res
        