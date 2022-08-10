class Solution:
    def deleteAndEarn(self, nums: List[int]) -> int:
        hmap = Counter(nums)
        nums = sorted(list(set(nums)))
        e1, e2 = 0, 0
        for i in range(len(nums)):
            curEarn = nums[i] * hmap[nums[i]]
            if i > 0 and nums[i] == nums[i - 1] + 1:
                temp = e2
                e2 = max(curEarn + e1, e2)
                e1 = temp
            else:
                temp = e2
                e2 = curEarn + e2
                e1 = temp
        return e2