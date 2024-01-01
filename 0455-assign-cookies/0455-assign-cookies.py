class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort(reverse=True)
        s.sort(reverse=True)
        
        one, two, count = 0, 0, 0

        while one < len(g) and two < len(s):
            if s[two] >= g[one]:
                s[two] -= g[one]
                g[one] = 0
                one += 1
                two += 1
            else:
                one += 1

        count += g.count(0)

        return count
