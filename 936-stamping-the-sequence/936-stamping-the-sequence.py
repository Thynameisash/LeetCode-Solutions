class Solution:
    def movesToStamp(self, stamp: str, target: str) -> List[int]:
        slen, tlen = len(stamp), len(target)
        res = []
        
        stampcovers = set()   # create permutation of cover on characters in stamp
        for i in range(slen):
            for j in range(slen - i):
                stampcovers.add('#' * i + stamp[i:slen-j] + '#' * j)
		
        done = '#' * tlen
		
        p = tlen - slen 
        while target != done:
            
            found = False
            for i in range(p, -1, -1):
                if target[i: i+slen] in stampcovers:
                    target = target[:i] + '#' * slen + target[i+slen:]  # add the mask to the target
                    res.append(i)
                    found = True
            if not found:   # if we cannot find where to put the stamp, return empty array
                return []
        
        return res[::-1]