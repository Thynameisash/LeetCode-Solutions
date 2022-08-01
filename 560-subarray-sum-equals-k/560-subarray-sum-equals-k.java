class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0,1);
        int presum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            presum+=nums[i];
            if (hs.containsKey(presum-k))
            {
                count+=hs.get(presum-k);
            }
             hs.put(presum, hs.getOrDefault(presum, 0) + 1);
        }
        return count;
    }
}