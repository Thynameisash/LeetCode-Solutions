class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        List<Integer> list = new ArrayList<>();
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
        for (i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
            {
                list.add(i+1);
            }
        }
        return list;
    }
}