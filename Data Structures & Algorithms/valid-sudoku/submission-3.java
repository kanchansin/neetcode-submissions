class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] r = new boolean[9][9];
        boolean[][] c = new boolean[9][9];
        boolean[][] b = new boolean[9][9];
        for(int i=0; i<9;i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    int num = board[i][j]-'1';
                    int bi = (i/3)*3+(j/3);
                    if(r[i][num] || c[j][num] || b[bi][num]){
                        return false;
                    }
                    r[i][num] = c[j][num] = b[bi][num] = true;
                }
            }
        }
        return true;
    }
}
