class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        count1=0
        count2=0
        vowels=['a','e','i','o','u']
        s1=s[:len(s)//2]
        s2=s[len(s)//2:]
        
        for i in s1:
            if i.lower() in vowels:
                count1+=1
        for i in s2:
            if i.lower() in vowels:
                count2+=1
                
        return count1==count2