class Solution {
    public int maxScoreSightseeingPair(int[] nums) {
        int [] ai=new int [nums.length];
        int [] aj=new int [nums.length];
        int n=nums.length-1;
        ai[0]=nums[0];
        aj[n]=nums[n]-n;
        
        for(int i=1;i<n;i++){
            ai[i]=Math.max(ai[i-1],nums[i]+i);
        }
        
        for(int j=n-1;j>0;j--){
            aj[j]=Math.max(aj[j+1],nums[j]-j);
        }
        
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(ai[i]+aj[i+1],max);
        }
        
        return max;
    }
}
