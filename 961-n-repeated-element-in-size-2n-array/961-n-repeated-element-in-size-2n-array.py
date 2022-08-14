class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        visited = set()         # store the visited numbers
        
        for n in nums:
            if n in visited:    # if number was visited before we found it
                return n        # no need to count all numbers, because only one number is repeated
            visited.add(n)  