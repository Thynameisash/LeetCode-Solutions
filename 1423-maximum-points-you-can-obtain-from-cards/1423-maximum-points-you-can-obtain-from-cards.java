class Solution {
public int maxScore(int[] c, int k) {
int s=0,t=0,h=Integer.MAX_VALUE;
int n=c.length-k;
for(int i=0;i<n;i++){

            t+=c[i];
        s+=c[i];
    }
    h=Math.min(h,t);
    for(int i=n;i<c.length;i++){
        s+=c[i];
        t-=c[i-n];
        t+=c[i];
          h=Math.min(h,t);
    }
    return s-h;
}
}