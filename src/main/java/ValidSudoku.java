import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        ValidSudokuSolution s = new ValidSudokuSolution();
        char[][] board = {{'.','.','.','.','.','.','5','.','.'},
                          {'.','.','.','.','.','.','.','.','.'},
                          {'.','.','.','.','.','.','.','.','.'},
                          {'9','3','.','.','2','.','4','.','.'},
                          {'.','.','7','.','.','.','3','.','.'},
                          {'.','.','.','.','.','.','.','.','.'},
                          {'.','.','.','3','4','.','.','.','.'},
                          {'.','.','.','.','.','3','.','.','.'},
                          {'.','.','.','.','.','5','2','.','.'}};
        s.isValidSudoku(board);
    }
}

class ValidSudokuSolution {
    public boolean isValidSudoku(char[][] board) {
        boolean isValid = true;
        for(int row = 0; row < 9; row++) {
            isValid = isValid(board[row]);
            if (!isValid) {
                return false;
            }
        }

        for(int col = 0; col < 9; col++) {
            char[] colArr = {board[0][col], board[1][col], board[2][col],
                             board[3][col], board[4][col], board[5][col],
                             board[6][col], board[7][col], board[8][col]};
            isValid = isValid(colArr);
            if (!isValid) {
                return false;
            }
        }

        int row = 3;
        int col = 3;
        while (row <= 9 && col <= 9) {
            char[] charArr = {board[row - 3][col - 3],board[row - 3][col - 2], board[row - 3][col - 1],
                              board[row - 2][col - 3],board[row - 2][col - 2], board[row - 2][col - 1],
                              board[row - 1][col - 3],board[row - 1][col - 2], board[row - 1][col - 1]};

            isValid = isValid(charArr);
            if (!isValid) {
                return false;
            } else {
                if (col == 9) {
                    col = 3;
                    row += 3;
                } else {
                    col += 3;
                }
            }
        }

        return isValid;
    }

    public boolean isValid(char[] row) {
        boolean rowValid = true;
        Set<Character> charSet = new HashSet<Character>();
        for(int i = 0; i < 9; i++) {
            if (row[i] != '.') {
                if (!charSet.contains(row[i])) {
                    charSet.add(row[i]);
                } else {
                    return false;
                }
            }
        }

        return rowValid;
    }
}

