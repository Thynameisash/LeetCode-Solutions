class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> charMap = new HashMap<>();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for (int i = 0; i < sArray.length; i++) {
            if (!charMap.containsKey(sArray[i]) && !charMap.containsValue(tArray[i])) {
                charMap.put(sArray[i], tArray[i]);
            } else {
                Character singleValue = charMap.get(sArray[i]);
                if (singleValue == null || !singleValue.equals(tArray[i])) {
                    return false;
                }
            }
        }
        System.out.println(charMap);
        return true;

    }
}