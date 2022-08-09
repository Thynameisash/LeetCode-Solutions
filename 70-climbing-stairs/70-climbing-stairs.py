class Solution:
    def climbStairs(self, n: int) -> int:   
        last,secondlast = 1,1
        
        for i in range(n-1):
            temp=secondlast
            secondlast+=last
            last=temp
            
        return secondlast