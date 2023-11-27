class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int m = matrix.length;
        int low = 0, high = (m*n)-1;
        while(low<=high){
            int mid=(low+high)/2, row = mid/n, col=mid%n;
            if(matrix[row][col]==target){
                return true;
            } else if(matrix[row][col]>target){
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return false;
    }
}