class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int trials = minutesToTest/minutesToDie;
        return (int)Math.ceil(Math.log(buckets)/Math.log(trials+1));
    }
}