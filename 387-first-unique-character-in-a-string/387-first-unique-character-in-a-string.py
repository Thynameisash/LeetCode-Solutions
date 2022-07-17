class Solution:
    def firstUniqChar(self, s: str) -> int:
        countarr=Counter(s)
        for i in countarr:
            if countarr[i]==1:
                return s.index(i)
        return -1;
