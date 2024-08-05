class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].equals(arr[i])){
                    list.remove(arr[i]);
                    list.remove(arr[j]);
                    break;
                }
            }
        }
        return (list.isEmpty() || list.size() < k - 1) ? "" : list.get(k - 1);
    }
}