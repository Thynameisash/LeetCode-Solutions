class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
    //     Collections.sort(arrays, (a,b) -> a.get(0) - b.get(0));
    //     return Math.abs(arrays.get(0).get(0) - arrays.get(arrays.size() - 1).get(arrays.get(arrays.size() - 1).size() - 1));
    // }

        int globalMin = arrays.get(0).get(0);
        int globalMax = arrays.get(0).get(arrays.get(0).size() - 1);
        int globalDistance = 0;
        int maxDistance = 0;
        
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> outer = arrays.get(i);
            int localMin = outer.get(0);
            int localMax = outer.get(outer.size() - 1);
            
            maxDistance = Math.max(maxDistance, Math.abs(localMin - globalMax));
            maxDistance = Math.max(maxDistance, Math.abs(globalMin - localMax));
            globalMin = Math.min(globalMin, localMin);
            globalMax = Math.max(globalMax, localMax);
        }
        return maxDistance;
    }
}

