class Solution {
    public int countBattleships(char[][] board) {
        int w = board.length;
        int h = board[0].length;
        int count = 0;
        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                if(i > 0 && board[i-1][j] == 'X') continue;
                if(j > 0 && board[i][j-1] == 'X') continue;
                if(board[i][j] == 'X') count++;
            }
        }
        return count;
    }
}