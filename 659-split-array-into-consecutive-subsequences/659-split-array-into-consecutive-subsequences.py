class Solution:
    def isPossible(self, nums: List[int]) -> bool:
        
        freq = Counter(nums)
        start, end = min(freq.keys()), max(freq.keys())
        
        i = start
        while i < end+1:
            if freq[i] == 0:
                i+=1
                continue
            # current frequency should >= previous
            max_freq = freq[i]
            j=i
            count=0
            while j < end+1 and freq[j] >= max_freq:
                max_freq = max(freq[j], max_freq)
                freq[j]-=1
                j+=1
                count+=1
            if count < 3:
                return False
        return True
