class Solution {
    public char findTheDifference(String s, String t) {
        ArrayList<Character> al = new ArrayList<>();
        char str1[] = s.toCharArray();
        char str2[] = t.toCharArray();
        
        for (int i=0;i<str2.length;i++){
            al.add(str2[i]);
        }
        for(int j=0;j<str1.length;j++){
            al.remove(al.indexOf(str1[j]));
        }
        
        return al.get(0);
    }
}
