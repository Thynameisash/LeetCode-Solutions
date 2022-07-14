class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        d1 = Counter(ransomNote)
        d2 = Counter(magazine)
        for i in d1:
            if d2[i] < d1[i]:
                return False
        return True