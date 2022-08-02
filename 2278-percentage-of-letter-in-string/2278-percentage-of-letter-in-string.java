class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        char chars[] = s.toCharArray();
        for(char ch : chars){
            if(ch==letter){
                count++;
            }
        }
        return (count*100)/chars.length;
    }
}