class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, ans, 0);
        return ans;
    }

    private void dfs(Node root, List<List<Integer>> ans, int level) {
        if(root == null)
            return;

        if(ans.size() <= level)
            ans.add(new ArrayList<>());

        ans.get(level).add(root.val);

        for(Node child : root.children)
            dfs(child, ans, level + 1);
    }
}