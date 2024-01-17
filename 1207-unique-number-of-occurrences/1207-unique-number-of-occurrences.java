class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        Set<Integer> occurrencesSet = new HashSet<>(map.values());
        return occurrencesSet.size() == map.size();
    }
}