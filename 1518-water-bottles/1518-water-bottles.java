class Solution {
    public int numWaterBottles(int fill, int empty) {
        int remain = 0;
        int start = fill;
        
        while (fill >= empty) {  
            remain = fill % empty;
            fill = fill / empty;
            start += fill; 
            fill += remain;
        }
        
        return start;
    }
}
