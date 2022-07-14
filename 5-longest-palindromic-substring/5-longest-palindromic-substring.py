class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s)<2: return s
        if s==s[::-1]: return s
        if len(s) >=1 and len(s)<=1000 :
            str1=""
            len1=0
            for i in range(len(s)):
                for j in range(i,len(s)):
                    str2=s[i:j+1]
                    if str2==str2[::-1] and len(str2)>len1:
                        str1=str2
                        len1=len(str2)
        return str1