class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int [][]dimensions = {{0,1},{1,0},{0,-1},{-1,0}};
        int n=rows*cols;
        int [][]ans = new int [n][2];
        ans[0][0]=rStart;
        ans[0][1]=cStart;
        int count=1;
        int step=1;
        int index=0;
        while(count<n){
            for(int i=0;i<2;i++){
                int dr = dimensions[index%4][0];
                int dc = dimensions[index%4][1];
                for(int j=0;j<step;j++){
                    rStart+=dr;
                    cStart+=dc;
                    if(rStart>=0 && rStart<rows && cStart>=0 && cStart<cols){
                        ans[count][0]=rStart;
                        ans[count][1]=cStart;
                        count++;
                    }
                }
                index++;
            }
            step++;
        }
        return ans;
    }
}