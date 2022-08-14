class Solution:
    def findLadders(self, beginWord: str, endWord: str, wordList: List[str]) -> List[List[str]]:
        if endWord not in wordList:
            return []
        if beginWord not in wordList:
            wordList.append(beginWord)
            
        graph = self.createGraph(beginWord,wordList)
        sgraph = self.bfs(beginWord,graph,wordList)
        #print(graph)
        self.ans = []
        self.dfs([endWord],sgraph,endWord)
        if len(self.ans) == 1:
            if len(self.ans[0]) == 1:
                return []
        return self.ans
    
    def bfs(self,src,graph,words):
        dist = {i:0 for i in words}
        sgraph = {}
        for i in range(len(words)):
            if words[i] != src:
                dist[words[i]] = 2**31
        sgraph = {i:[] for i in words}
        qu = [src]
        while len(qu) > 0:
            par = qu.pop(0)
            for nb in graph[par]:
                if dist[nb] == 2**31:
                    sgraph[nb].append(par)
                    dist[nb] = 1 + dist[par]
                    qu.append(nb)
                    
                else:
                    if dist[nb] == 1 + dist[par]:
                        sgraph[nb].append(par)
                    elif dist[par] + 1 < dist[nb]:
                        sgraph[nb].clear()
                        sgraph[nb].append(par)
                        
        return sgraph
                        
    def dfs(self,asf,parents,node):
        if len(parents[node]) == 0:
            asf.reverse()
            #print(asf)
            self.ans.append(asf)
            return 
        
        if parents[node]:
            for ch in parents[node]:
                self.dfs(asf+[ch],parents,ch)
        return
        
    def createGraph(self,src,nodes):
        graph = {i:[] for i in nodes}
        for i in range(len(nodes)):
            for j in range(i,len(nodes)):
                if self.isConnection(nodes[i],nodes[j]):
                    sr = nodes[i]
                    nb = nodes[j]
                    graph[sr].append(nb)
                    graph[nb].append(sr)
                        
        return graph
    
    def isConnection(self,a,b):
        diff = 0
        for i in range(len(a)):
            if a[i] != b[i]:
                diff+=1
                
        return diff == 1