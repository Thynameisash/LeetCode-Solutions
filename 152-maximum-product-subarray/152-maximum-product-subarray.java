class Solution {
    public int maxProduct(int[] nums) {
        int maxprod = Integer.MIN_VALUE;
        int nlen=nums.length;
        int prod = 1;
        for (int i = 0; i < nlen; i++) {
            prod *= nums[i];
            maxprod = Math.max(maxprod, prod);
            if (prod == 0)
                prod = 1;
        }
        prod = 1;
        for (int i = nlen - 1; i >= 0; i--) {
            prod *= nums[i];
            maxprod = Math.max(maxprod, prod);
            if (prod == 0)
                prod = 1;
        }
        return maxprod;
    }
}