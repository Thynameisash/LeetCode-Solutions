class Solution:
    def longestWPI(self, hours: List[int]) -> int:
        ans = diff = 0                              
        pref = defaultdict(int)                     
        for i,hour in enumerate(hours):
            if diff not in pref: pref[diff] = i     
            diff+= 2*(hour > 8) - 1                 
                                                    
            if diff-1 in pref:
                ans = max(ans,              
                      i+1-pref[diff-1],             
                      i+1 if diff > 0 else 0)       
                      
        return ans   