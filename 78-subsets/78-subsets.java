class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        ans.add(new ArrayList());
        for(int num:nums) // 1 2 3
        {
            int n=ans.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> temp = new ArrayList(ans.get(i)); //[]
                temp.add(num); // [1]
                ans.add(temp); // [],[1]
            }
        }
        return ans;
    }
}