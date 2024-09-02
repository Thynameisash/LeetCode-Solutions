class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        if(chalk.length == 1) return 0;
        
        int i=0;
        while(k>=chalk[i]){
            k-=chalk[i];
            if(i==chalk.length-1){
                i=i%(chalk.length-1);
            } else i++;
        }
        return i;
    }
}