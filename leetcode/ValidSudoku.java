package leetcode;

import java.util.Arrays;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * <p>
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: board =* {{5','3','.','.','7','.','.','.','.'} ,{'6','.','.','1','9','5','.','.','.'}
 * ,{'.','9','8','.','.','.','','6','.'}
 * ,{'8','.','.','.','6','.','.','.','3'}
 * ,{'4','.','.','8','.','3','.','.','1'}
 * ,{'7','.','.','.','2','.','.','.','6'}
 * ,{'.','6','.','.','.''.','2','8','.'}
 * ,{'.','.','.','4','1','9','.','.','5'}
 * ,{'.','.','.','.','8','.','','7','9'}]
 * Output: true
 * Example 2:
 * <p>
 * Input: board =* {{8','3','.','.','7','.','.','.','.'} ,{'6','.','.','1','9','5','.','.','.'}
 * ,{'.','9','8','.','.','.','.','6','.'}
 * ,{'8','.','.','.','6','.','.','.','3'}
 * ,{'4','.','','8','.','3''.','.','1'}
 * ,{'','.','.','.','2','.','.','.','6'}
 * ,{'.','6','.','.','.','.','2','8','.'}
 * ,{'.','.','.','4','1','9','.','.','5'}
 * ,{'.','.','.','.','8','.','.','','9'}]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 */
public class ValidSudoku {
    public static void main(String[] args) {
        System.out.println(isValidSudoku(new char[][]{
                    /**   {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                        {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                        {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                        {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                        {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                        {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                        {'.', '.', '4', '.', '.', '.', '.', '.', '.'}*/
                       /**  {'5','3','.','.','7','.','.','.','.'}
                         ,{'6','.','.','1','9','5','.','.','.'}
                         ,{'.','9','8','.','.','.','.','6','.'}
                         ,{'8','.','.','.','6','.','.','.','3'}
                         ,{'4','.','.','8','.','3','.','.','1'}
                         ,{'7','.','.','.','2','.','.','.','6'}
                         ,{'.','6','.','.','.','.','2','8','.'}
                         ,{'.','.','.','4','1','9','.','.','5'}
                         ,{'.','.','.','.','8','.','.','7','9'} */
                            {'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                           , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                           , {'.', '9', '5', '.', '.', '.', '.', '6', '.'}
                           , {'5', '.', '.', '.', '6', '.', '.', '.', '3'}
                           , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                           , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                           , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                           , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                           , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}


                }

        ));


    }

    public static boolean isValidSudoku(char[][] board) {
        int r[] = new int[9];
        Arrays.fill(r, 0);
        int c[] = new int[9];
        Arrays.fill(c, 0);
        //int test = Integer.parseInt(String.valueOf('.'));
        for (int i = 0; i < 9; i++) {
            r = new int[9];
            c = new int[9];
            for (int j = 0; j < 9; j++) {
                int temprow = 0, tempcol = 0;
                if (board[i][j] != '.') {
                    temprow = Integer.parseInt(String.valueOf(board[i][j]));

                    if (r[temprow - 1] != 0) {
                        return false;
                    } else
                        r[temprow - 1] = temprow;
                }
                if (board[j][i] != '.') {
                    tempcol = Integer.parseInt(String.valueOf(board[j][i]));
                    if (c[tempcol - 1] != 0) {
                        return false;
                    } else
                        c[tempcol - 1] = tempcol;
                }
            }
        }
        int rtemp = 0, ctemp = 0;
        do {
            r = new int[9];
            for (int i = rtemp; i < (rtemp + 3); i++) {
                for (int j = ctemp; j < (ctemp + 3); j++) {
                    int temprow = 0;
                    if (board[i][j] != '.') {
                        temprow = Integer.parseInt(String.valueOf(board[i][j]));

                        if (r[temprow - 1] != 0) {
                            return false;
                        } else
                            r[temprow - 1] = temprow;
                    }
                }
            }
            if (ctemp < 6) {
                ctemp += 3;
                r = new int[9];
            }
            else {
                ctemp = 0;
                rtemp += 3;
            }
        } while (rtemp <= 6);
        /*int rtemp = 0, ctemp = 0;
        while ((rtemp) <= 6) {
            for (int i = rtemp; i < (rtemp + 3); i++) {
                r = new int[9];
                while (ctemp <= 6) {
                    for (int j = ctemp; j < (ctemp + 3); j++) {

                        int temprow = 0;
                        if (board[i][j] != '.') {
                            temprow = Integer.parseInt(String.valueOf(board[i][j]));

                            if (r[temprow - 1] != 0) {
                                return false;
                            } else
                                r[temprow - 1] = temprow;
                        }
                    }
                    if ((ctemp) <= 6)
                        ctemp += 3;
                    r = new int[9];
                }
            }
            ctemp=0;
            rtemp += 3;
        }*/
        return true;
    }
}