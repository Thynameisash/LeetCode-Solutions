class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, result, 0);
        return result;
    }

    private void dfs(Node root, List<List<Integer>> result, int level) {
        if(root == null)
            return;

        if(result.size() <= level)
            result.add(new ArrayList<>());

        result.get(level).add(root.val);

        for(Node child : root.children)
            dfs(child, result, level + 1);
    }
}