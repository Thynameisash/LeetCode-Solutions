class Solution {
    public int change(int amount, int[] coins) {
        Map<String,Integer> map = new HashMap<>();
        return helper(coins, amount, 0, map);
    }
    public int helper(int[] coins, int amount, int lastcoin, Map<String,Integer> map){     
        
        if(amount == 0){
            return 1;
        }
        
        String key = amount + "and" + lastcoin;
        if(map.containsKey(key)){
            return map.get(key);
        }
        
        int count = 0;
        for(int i = lastcoin; i < coins.length; i++){
            if(amount - coins[i] >= 0)
            count += helper(coins, amount - coins[i], i, map);
        }
        
        map.put(key,count);
        return count;
    }
}