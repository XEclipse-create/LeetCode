class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char current = board[i][j];
                if(current != '.')
                    if(!set.add(current +"found in row"+ i) || !set.add(current + "found in column "+ j) || !set.add(current + "found in "+ i/3 +'-'+ j/3))
                        return false;
                        
            }
        }
        return true;
        
    }
}
