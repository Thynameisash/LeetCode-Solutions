class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        asc=[]
        n=len(letters)
        for i in range(n):
            asc.append(ord(letters[i]))
        for i in range(n):
            if asc[i]>ord(target):
                return chr(asc[i])
        return chr(asc[0])