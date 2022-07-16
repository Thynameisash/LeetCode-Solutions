class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        res = []
        for i in range(rowIndex+1):
            row = []
            for j in range(i+1):
                if j == i or j==0:
                    row.append(1)
                else:
                    row.append(res[i-1][j-1] + res[i-1][j])
            res.append(row)
        return res[-1]