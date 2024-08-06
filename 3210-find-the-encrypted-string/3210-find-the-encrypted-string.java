class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        k = k % n;
        
        String partOne = s.substring(0, k);
        String partTwo = s.substring(k);
        
        return partTwo + partOne;
    }
}