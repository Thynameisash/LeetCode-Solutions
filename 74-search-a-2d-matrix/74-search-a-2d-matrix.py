class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if target in sum(matrix,[]): 
            return True
        return False     
        
        