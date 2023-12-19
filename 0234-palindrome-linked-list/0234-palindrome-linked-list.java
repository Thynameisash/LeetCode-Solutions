class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder s = new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
            s.append(temp.val);
            temp=temp.next;
        }
        String originalString = s.toString();  
        String reversedString = s.reverse().toString();
        return originalString.equals(reversedString);
    }
}