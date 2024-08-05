class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> ans = new ArrayList(Arrays.asList(arr));
        for(int a=0; a<arr.length; a++){
            for(int i=a+1; i<arr.length; i++){
                if(arr[a].equals(arr[i])){
                    ans.remove(arr[i]);
                    ans.remove(arr[a]);
                }
            }
        }
        return (ans.isEmpty() || ans.size() < k - 1) ? "" : ans.get(k - 1);

    }
}