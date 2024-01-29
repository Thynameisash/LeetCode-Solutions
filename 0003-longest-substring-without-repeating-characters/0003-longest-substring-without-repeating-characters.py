class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        len1=0
        for i in range(0,len(s)):
            len2=0
            str2=""
            for j in range (i,len(s)):
                if s[j] not in str2:
                    str2+=s[j]
                    len2=len(str2)
                else:
                    break
                if len2>len1:
                    len1=len2
        return len1