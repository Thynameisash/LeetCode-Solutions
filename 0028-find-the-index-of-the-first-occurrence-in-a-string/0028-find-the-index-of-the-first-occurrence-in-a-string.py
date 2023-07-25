class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if (len(needle)==0):
            return []
        else :
            for i in range(0,len(haystack) - len(needle) + 1):
                if haystack[i:i+len(needle)]==needle : return i
        return -1
                