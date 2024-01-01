class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        one = 0
        two = 0
        count = 0
        newg = sorted(g, reverse=True)
        news = sorted(s, reverse=True)
        
        while one < len(newg) and two < len(news):
            if news[two] >= newg[one]:
                news[two] -= newg[one]
                newg[one] = 0
                one += 1
                two += 1
            else:
                one += 1

        for i in newg:
            if i == 0:
                count += 1

        return count
        
            