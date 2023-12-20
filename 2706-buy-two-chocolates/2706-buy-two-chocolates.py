class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        choc=[]
        globalmoney=money
        for i in prices:
            if i<=money:
                choc.append(i)
        choc.sort()
                
        for i in range(0,len(choc)):
            for j in range(1,len(choc)):
                if choc[i]+choc[j]<=money:
                    return money-(choc[i]+choc[j])
        return money
        
    