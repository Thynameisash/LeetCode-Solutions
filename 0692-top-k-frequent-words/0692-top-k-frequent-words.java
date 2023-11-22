class Solution {
    public List < String > topKFrequent(String[] words, int k) {

        Map < String, Integer > map = new HashMap < > ();
        for (String word: words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.print(map);
        List < Map.Entry < String, Integer >> answer = new ArrayList < > (map.entrySet());
        Collections.sort(answer, new Comparator < Map.Entry < String, Integer >> () {
            public int compare(Map.Entry < String, Integer > entry1, Map.Entry < String, Integer > entry2) {
                int result = entry2.getValue().compareTo(entry1.getValue());
                if (result == 0) {
                    result = entry1.getKey().compareTo(entry2.getKey());
                }
                return result;
            }
        });
        int count=0;
        List<String> finalans = new ArrayList<String>();
        for(Map.Entry<String,Integer> ans : answer)
        {
            if(count==k)
                break;
            else 
            {
                finalans.add(ans.getKey());
                count++;
            }
        }

        return finalans;
    }
}