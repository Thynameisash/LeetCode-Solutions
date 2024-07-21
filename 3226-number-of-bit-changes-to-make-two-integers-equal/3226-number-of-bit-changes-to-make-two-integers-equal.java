class Solution {
    public int minChanges(int n, int k) {    
        
        if ((n & k) != k){
            return -1;
        }
        
        String binaryN = Integer.toBinaryString(n);
        String binaryK = Integer.toBinaryString(k);
        
        int maxLength = Math.max(binaryN.length(), binaryK.length());

        while (binaryK.length() < maxLength) {
            binaryK = "0" + binaryK;
        }
        
        char[] nArray = binaryN.toCharArray();
        char[] kArray = binaryK.toCharArray();
        
        int count = 0;
        
        for (int i = 0; i < nArray.length; i++) {
            if (nArray[i] != kArray[i] && nArray[i]=='1') {
                count++;
            }
        }
        
        return count;
    }
}