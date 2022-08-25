class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        count=Counter(arr)
        values=[]
        
        for i in count:
            values.append(count[i])
        return len(values)==len(set(values))