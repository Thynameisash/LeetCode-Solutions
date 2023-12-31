class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        char []str = s.toCharArray();
        int count=0;
        int gmax=-1;
        for(int i=0;i<str.length;i++){
            for(int j=str.length-1;j>i;j--){
                if(j==i+1 && str[i]==str[j] ) gmax=Math.max(gmax,count);
                else if (str[i]==str[j]){
                    count=j-i-1;
                    gmax=Math.max(gmax,count);
                    // gmax-=1;
                }
            }
        }
        return gmax;
    }
}