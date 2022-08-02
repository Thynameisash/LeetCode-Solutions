class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        s2=""
        st=[]
        for i in s:
            if i.isalpha():
                st.append(i)
        for i in s:
            if i.isalpha():
                s2+=st.pop()
            else:
                s2+=i
        return s2