class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder s = new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
            s.append(temp.val);
            temp=temp.next;
        }
        String originalString = s.toString();  // Convert StringBuilder to String
        String reversedString = s.reverse().toString();  // Reverse and convert to String
        System.out.print(reversedString);
        return originalString.equals(reversedString);
    }
}