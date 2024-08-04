class Solution {
    public boolean canAliceWin(int[] nums) {
        Arrays.sort(nums);
        int sum=0,sum2=0;
        int splitIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                splitIndex=i;
            }
        }
        if(splitIndex!=nums.length){
            int[] firstHalf = Arrays.copyOfRange(nums, 0, splitIndex+1);
            int[] secondHalf = Arrays.copyOfRange(nums, splitIndex+1, nums.length);
            sum = Arrays.stream(firstHalf).sum();
            sum2 = Arrays.stream(secondHalf).sum();
            return sum!=sum2;
        } else {
            return true;
        }
    }
}