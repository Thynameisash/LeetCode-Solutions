class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        int nop = names.length;
        Map<Integer, String> hMap = new HashMap<>();
        for (int i = 0; i < nop; i++) {
            hMap.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] sortedNames = new String[nop];

        // Populate sortedNames array in descending order of height
        for (int i = nop - 1; i >= 0; i--) {
            sortedNames[nop - i - 1] = hMap.get(heights[i]);
        }

        return sortedNames;
    }
}