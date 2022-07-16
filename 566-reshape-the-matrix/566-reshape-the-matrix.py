class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        m,n = len(mat), len(mat[0])
        if m*n!=r*c:
            return mat
        row=[]
        res=[]
        for i in range(m):
            for j in range(n):
                row.append(mat[i][j])
                if len(row)==c:
                    res.append(row)
                    row=[]
        return res