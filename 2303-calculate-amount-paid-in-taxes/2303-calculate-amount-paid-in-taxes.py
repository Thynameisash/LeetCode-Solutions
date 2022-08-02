class Solution:
    def calculateTax(self, brackets: List[List[int]], income: int) -> float:
        totaltax = prevbracket = 0
        for upper, percent in brackets:
            if income >= upper:
                totaltax += (upper - prevbracket)*percent/100
                prevbracket = upper
            else: 
                totaltax += (income - prevbracket)*percent/100
                return totaltax
        return totaltax    
        