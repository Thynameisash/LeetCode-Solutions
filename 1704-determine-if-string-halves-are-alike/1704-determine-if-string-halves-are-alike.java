class Solution {
    public boolean halvesAreAlike(String s) {
        ArrayList<Character> al = new ArrayList<>();
        int count1=0,count2=0;
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
        
        int half = s.length()/2;
        char [] str = s.toCharArray();
        for(int i=0;i<half;i++){
            if(al.contains(str[i])){
                System.out.print(str[i]);
                count1++;
            }
        }
       
       for(int i=half;i<s.length();i++){
            if(al.contains(str[i])){
                System.out.print(str[i]);
                count2++;
            }
        }
        return count1==count2;
    }
}