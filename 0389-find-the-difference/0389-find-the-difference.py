class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        for x in t:
            if x not in s:
                return x 
            s=s.replace(x,"",1)