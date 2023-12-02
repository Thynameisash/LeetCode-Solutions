class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : chars.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int sum = 0;
        for (String word : words) {
            HashMap<Character, Integer> hashmap = new HashMap<>(map);
            int len = 0;
            for (char ch : word.toCharArray()) {
                if (hashmap.containsKey(ch) && hashmap.get(ch) > 0) {
                    hashmap.put(ch, hashmap.get(ch) - 1);
                    len++;
                }
            }
            sum += (len == word.length()) ? len : 0;
        }
        return sum;
    }
}