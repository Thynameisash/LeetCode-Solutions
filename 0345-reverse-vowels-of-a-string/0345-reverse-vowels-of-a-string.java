import java.util.ArrayList;

class Solution {
    public String reverseVowels(String s) {
        int low = 0;
        int high = s.length() - 1;
        StringBuilder str = new StringBuilder(s);
        ArrayList<Character> al = new ArrayList<>();
        al.add('a');
        al.add('e');
        al.add('i');
        al.add('o');
        al.add('u');
        al.add('A');
        al.add('E');
        al.add('I');
        al.add('O');
        al.add('U');

        while (low < high) {
            if (al.contains(str.charAt(low)) && al.contains(str.charAt(high))) {
                char temp = str.charAt(low);
                str.setCharAt(low, str.charAt(high));
                str.setCharAt(high, temp);
                low++;
                high--;
            } else if (!al.contains(str.charAt(low))) {
                low++;
            } else {
                high--;
            }
        }
        return str.toString();
    }
}
