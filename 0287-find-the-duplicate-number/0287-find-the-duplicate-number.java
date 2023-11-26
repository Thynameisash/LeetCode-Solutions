class Solution {
    public int findDuplicate(int[] nums) {
    int slow = nums[0];
    int fast = nums[0];

    // Phase 1: Find the intersection point of the two pointers
    do {
        slow = nums[slow];
        fast = nums[nums[fast]];
    } while (slow != fast);

    // Phase 2: Move one pointer to the start and find the entrance to the cycle
    fast = nums[0];
    while (fast != slow) {
        slow = nums[slow];
        fast = nums[fast];
    }

    // The intersection point is the duplicate element
    return fast;
}
}
