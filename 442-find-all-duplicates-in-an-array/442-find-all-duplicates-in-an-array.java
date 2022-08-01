class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> al=new ArrayList<>();
        
        //Cyclic Sort
        while(i<nums.length)
        {
            int correctindx=nums[i]-1;
            if(nums[correctindx]!=nums[i])
            {
                int temp=nums[correctindx];
                nums[correctindx]=nums[i];
                nums[i]=temp;
            }
            else
            {
                i++;
            }
        }
        //Add the elements to the list that are not on their correct index.
            for (i=0;i<nums.length;i++)
            {
                if(nums[i]!=i+1)
                {
                    al.add(nums[i]);
                }
            }
        return al;
    }
}