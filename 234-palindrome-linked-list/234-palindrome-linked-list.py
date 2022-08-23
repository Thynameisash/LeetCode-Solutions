# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        temp=head
        num=""
        while temp!=None:
            num=num+str(temp.val)
            temp=temp.next
        print(num)
        return num==num[::-1]