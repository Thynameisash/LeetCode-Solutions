class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        startr,startc=0,0
        m=len(matrix)-1
        n=len(matrix[0])-1
        endr = len(matrix) - 1
        endc = len(matrix[0]) - 1
        res=[]
        while startr<=endr and startc<=endc:
            for i in range(startr,endc+1):
                res.append(matrix[startr][i])
            for i in range(startr+1,endr+1):
                res.append(matrix[i][endc])  
            for i in reversed(range(startc,endc)):
                if startr==endr:
                    break
                res.append(matrix[endr][i])
            for i in reversed(range(startr+1,endr)):
                if startc==endc:
                    break
                res.append(matrix[i][startc])
            
            startr += 1
            startc += 1
            endr -= 1
            endc -= 1
        return res
                