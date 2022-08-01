class Solution:
    def fib(self, n: int, q={}) -> int:
        if n < 2:
            return n
        
        if n not in q:
            q[n] = self.fib(n-1, q) + self.fib(n-2, q)
            
        return q[n]

#      def fib(self, n: int) -> int:
#         if n < 2:
#             return n
#         else:
#             ans = self.fib(n-1) + self.fib(n-2)
#         return ans