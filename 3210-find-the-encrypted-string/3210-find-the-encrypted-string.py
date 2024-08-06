class Solution:
    def getEncryptedString(self, s: str, k: int) -> str:
        n = len(s)
        k = k % n
        
        one = s[:k]
        two = s[k:]
        new = two + one
        
        return new
