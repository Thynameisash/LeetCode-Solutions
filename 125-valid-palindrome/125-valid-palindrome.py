class Solution:
    def isPalindrome(self, s: str) -> bool:
        strin=""
        s=s.lower()
        slen=len(s)
        for i in range(slen):
            asci=ord(s[i])
            if s[i].isalnum():
                strin+=s[i]
        print(strin)
        if strin==strin[::-1]:
            return True
        return False