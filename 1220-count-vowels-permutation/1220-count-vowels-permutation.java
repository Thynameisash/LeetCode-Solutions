class Solution {
    public int countVowelPermutation(int n) {
        //Base Case
        if (n==1) return 5;
        long mod=1000000007;
        long a=1,e=1,i=1,o=1,u=1;
        long new_a=0,new_e=0,new_i=0,new_o=0,new_u=0;
        
        for(int k=2;k<=n;k++){
        
            // New vowels can only be followed by some, as in given conditions
            new_a=e;
            new_e=(a+i)     % mod;
            new_i=(a+e+o+u) % mod;
            new_o=(i+u)     % mod;
            new_u=a;
            
            // Initial values are now the new values, so swap them. Alternate way of                     // recursion.
            a=new_a;
            e=new_e;
            i=new_i;
            o=new_o;
            u=new_u;
        }
        return (int)((new_a+new_e+new_i+new_o+new_u) % mod);
    }
}