class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(x,y)->Integer.compare(x[0],y[0]));
        List<int[]> list = new ArrayList<>();
        for (int [] ele : arr){
            if(list.isEmpty()){
                list.add(ele);
            } else{
                int prev[] = list.get(list.size()-1);
                if(prev[1]>=ele[0]){
                    prev[1] = Math.max(prev[1],ele[1]);
                }
                else{
                    list.add(ele);
                }
            }
        }
        return list.toArray(new int [list.size()][]);
    }
}