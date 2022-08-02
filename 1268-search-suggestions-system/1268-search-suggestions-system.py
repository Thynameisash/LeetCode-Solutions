class Solution:
    def suggestedProducts(self, products: List[str], searchWord: str) -> List[List[str]]:
        result=[]
        products.sort()
        for i in range(len(searchWord)):
            temp=[]
            for p in products:
                if i<len(p) and searchWord[i]==p[i]: temp.append(p)
            result.append(temp[:3])
            products=temp
        return result