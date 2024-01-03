class Solution {
    public char findTheDifference(String s, String t) {
        ArrayList<Character> al = new ArrayList<>();

        for (int i=0;i<t.length();i++){
            al.add(t.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            al.remove(al.indexOf(s.charAt(i)));
        }
        
        return al.get(0);
    }
}
