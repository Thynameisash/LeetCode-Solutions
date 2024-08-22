class Solution {
    public int findComplement(int num) {
        int bits = Integer.toBinaryString(num).length();
        long mask = (long)Math.pow(2, bits) - 1;
        
        // Return the XOR of the number and the bitmask
        return (int)(num ^ mask);
    }
}