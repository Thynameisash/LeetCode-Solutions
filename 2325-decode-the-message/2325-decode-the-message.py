class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        abc='abcdefghijklmnopqrstuvwxyz'
        d = defaultdict(str)
        i=0
        for ch in key :
            if ch!=" " and ch not in d:
                d[ch]+=abc[i]
                i+=1
            if ch==" " : continue
        ans=[]
        for m in message:
            if m==" ": ans.append(m)
            if m!=" ":
                ans.append(d[m])
        return "".join(ans)
                