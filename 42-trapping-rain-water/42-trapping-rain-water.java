class Solution {
    public int trap(int[] height) {
        int water = 0, start = 0, end = height.length - 1;
        
        while (start < end) {
            if (height[start] <= height[end]) {
                int current = height[start];
                while (height[++start] < current) {
                    water += current - height[start];
                }
            } else {
                int current = height[end];
                while(height[--end] < current) {
                    water += current - height[end];
                }
            }
        }
        return water;
    }
}