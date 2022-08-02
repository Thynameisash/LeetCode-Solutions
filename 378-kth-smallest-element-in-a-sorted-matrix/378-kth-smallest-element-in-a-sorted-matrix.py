class Solution:
    def kthSmallest(self, matrix: List[List[int]], k: int) -> int:
        matrix2 = sum(matrix,[])
        matrix2.sort()
        return matrix2[k-1]
        