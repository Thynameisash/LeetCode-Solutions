class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        //Cyclic Sort
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[correct]!=nums[i])
            {
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else
            {
                i++;
            }
        }
        //Return the repeating(nums[i]) and the missing number (index+1)
        for (i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                return new int[] {nums[i],i+1};
            }
        }
        return new int[] {-1,-1};
    }
}