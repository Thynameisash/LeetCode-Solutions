class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        arr=sorted(arr,key=lambda number:abs(x-number))
        return sorted(arr[:k])
        