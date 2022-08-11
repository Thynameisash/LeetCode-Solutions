class Solution:
    def jump(self, nums: List[int]) -> int:
        # to keep the count of number of jumps
        jump = 0
        # to creat a window and initially window is 0
        l = r = 0
        # run the loop while r does not reach to the end of nums array
        while r < len(nums) - 1:
            # to search of the farther we can reach from the current window
            farthest = 0
            for i in range(l,r + 1):
                farthest = max(farthest, i + nums[i])
            # once the farthest is found change l to r + 1 and r to the farthest to create a new window
            l = r + 1
            r = farthest
            # increment the count as we make 1 jump
            jump += 1
        # once loop is done return the count
        return jump