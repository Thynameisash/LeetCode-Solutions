class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        int len=1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num: set){
            if(!set.contains(num-1)){
                int count=1;
                int temp=num;
                while(set.contains(temp+1)){
                    temp++;
                    count++;
                }
                len=Math.max(len,count);
            }
        }
        return len;
    }
}