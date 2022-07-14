class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res=[]
        st=[]
        def balance(openb,closeb):
            if openb == closeb ==n:
                res.append("".join(st))
                return
            if openb<n:
                st.append("(")
                balance(openb+1,closeb)
                st.pop()
            if closeb<openb:
                st.append(")")   
                balance(openb,closeb+1)
                st.pop()
        balance(0,0)
        return res