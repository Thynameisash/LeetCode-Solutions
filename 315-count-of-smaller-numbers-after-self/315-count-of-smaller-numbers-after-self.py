from sortedcontainers import SortedList
class Solution:
    def countSmaller(self, nums: List[int]) -> List[int]:
        SList, ans = SortedList(), []
        for num in nums[::-1]:
            index = SortedList.bisect_left(SList, num)
            ans.append(index)
            SList.add(num)
            
        return ans[::-1]