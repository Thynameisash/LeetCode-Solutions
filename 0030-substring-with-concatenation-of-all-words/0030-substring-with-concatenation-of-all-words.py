class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        hmap={}
        for word in words:
            if word in hmap:
                hmap[word]+=1
            else:
                hmap[word]=1
                
        ans=[]
        st=0
        e=(len(words[0])*len(words))-1
        
        while e<len(s):
            ws=st
            we=st+len(words[0])-1
            temp={}
            while we<=e:
                if s[ws:we+1] in temp:
                    temp[s[ws:we+1]]+=1
                else:
                    temp[s[ws:we+1]]=1
                ws=we+1
                we=we+len(words[0])
            if temp==hmap:
                ans.append(st)
            st+=1
            e+=1
                  
        return ans
                  
        
            