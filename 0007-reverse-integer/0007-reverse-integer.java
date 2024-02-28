class Solution {
    public int reverse(int x) {
        int num=x, rem;
        long sum=0;
        while(num!=0){
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
    int s=(sum< Integer.MIN_VALUE || sum> Integer.MAX_VALUE) ? 0 : (int)sum;
    return s;
    }
}