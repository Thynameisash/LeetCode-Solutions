class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        res=[]
        def gen(num,curr):
            if num>n+1:
                return
            if len(curr)==k:
                res.append(curr[:])
                return
            curr.append(num)
            gen(num+1,curr)
            curr.pop()
            gen(num+1,curr)
        gen(1,[])
        return res