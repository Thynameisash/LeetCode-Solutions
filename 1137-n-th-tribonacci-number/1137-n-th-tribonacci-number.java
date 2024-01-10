class Solution {
    int dp[]=new int[46];
    public int tribonacci(int n) {
        if(dp[n]!=0) return dp[n];
        if(n==1 || n==2) return 1;
        if(n==0) return 0;
        
        dp[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        return dp[n];
    }
}
