class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        m=1
        while m<n:
            m=m*4
        print(m)
        if m==n:
            return True
        return False