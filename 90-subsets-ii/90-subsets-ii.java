class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        ans.add(new ArrayList());
        Arrays.sort(nums);
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
        HashSet<List<Integer>> hs = new HashSet<>(ans);
        List<List<Integer>> result = new ArrayList<>(hs);    
        return result;
    }
}