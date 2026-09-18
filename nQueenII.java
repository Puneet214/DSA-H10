class Solution {
    public int totalNQueens(int n) {
        int[][] board = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = 0;
            }
        }
        helper(board, 0);
        return count;
    }
    int count = 0;
    void helper(int[][] board , int row){
        if(row==board.length){
            count += 1;
            return;
        }
        for(int col = 0; col<board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col]=1;
                helper(board,row+1);
                board[row][col]=0;
            }
        }
    }
    boolean isSafe(int[][] board, int row, int col){
        for(int i = 0; i<row; i++){
            if(board[i][col]==1){
                return false;
            }
        }
            int r = row; 
            int c = col;
            while(r>=0&&c>=0){
                if(board[r][c]==1){
                    return false;
                }
                r--;
                c--;
            }
            r = row;  c = col;
            while(r>=0&&c<board.length){
                if(board[r][c]==1){
                    return false;
                }
                r--;
                c++;
            }
        
        return true;
    }
}