class Solution {
    public String getEncryptedString(String s, int k) {
        
        k = k % s.length();
        String partOne = s.substring(0, k);
        String partTwo = s.substring(k);
        
        return partTwo + partOne;
    }
}