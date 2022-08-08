class Solution {
    public int change(int amount, int[] coins) {
        Map<String, Integer> map = new HashMap<>();
        return change(amount, 0, map, coins);
    }
    
    public int change(int amount, int start, Map<String, Integer> map, int[] coins) {
        if (amount < 0)
            return 0;

        if (amount == 0) 
            return 1;
    
        String key = amount + "," + start;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        
        int ways = 0;
        for (int i = start; i < coins.length; ++ i) {
            ways += change(amount - coins[i], i, map, coins);
        }
        
        map.put(key, ways);
        return ways;
    }
}