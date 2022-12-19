import java.util.Arrays;

public class ValidSudoku {
    public static boolean checkExist(int i,int j,boolean[] unique,char[][] board){
        if(board[i][j] != '.'){
            int c = Character.getNumericValue(board[i][j]);
            if (unique[c]){
                return true;
            }
            unique[c] = true;
        }
        return false;
    }

    public boolean isValidSudoku(char[][] board) {

        boolean[] uniqueR = new boolean[10];
        boolean[] uniqueC = new boolean[10];
        boolean[] uniqueB = new boolean[10];
        int ri,ci;

        for(int i = 0; i < 9; i++){

            Arrays.fill(uniqueR, false);
            Arrays.fill(uniqueC, false);
            Arrays.fill(uniqueB, false);

            for(int j = 0; j < 9; j++){

                if(checkExist(i, j, uniqueR, board))
                    return false;

                if(checkExist(j, i, uniqueC, board))
                    return false;

                ri = (3*(i/3))+ (j/3);
                ci = (3*(i%3))+ (j%3);
                if(checkExist(ri, ci, uniqueB, board))
                    return false;
            }
        }

        return true;
    }
}
