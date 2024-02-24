class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
        for (int i=0;i<=8;i++){
            for (int j=0;j<=8;j++)
            {
                if(board[i][j] !='.')
                {
                    if( !hs.add(board[i][j] + " element found in row "+ i) ||
                        !hs.add(board[i][j] + " element found in col "+ j) ||
                        !hs.add(board[i][j] + " element found in box "+ i/3 + " : "+ j/3))
                        {
                            return false;
                        }
                }
            } 
        }
        return true;
    }
}