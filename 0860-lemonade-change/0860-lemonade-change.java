class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twen = 0;
        int total = 0;
        
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
                total+=5;
            } else if(bills[i]==10){
                if(five>0){
                    five--;
                    total-=5;
                    ten++;
                    total+=10;
                } else {
                    return false;
                }
            } else if (bills[i]==20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                    total-=15;
                    twen++;
                    total+=20;
                } else if(five>2) {
                    five-=3;
                    total-=15;
                    twen++;
                    total+=20;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}