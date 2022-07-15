class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        s2=""
        ans=0
        for i in digits:
            s2+=str(i)
        s2=int(s2)+1
        return list(str(s2))