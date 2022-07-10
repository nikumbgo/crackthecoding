package leetcode;

import java.util.Arrays;

/**
 * In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
 *
 * You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
 *
 * The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
 *
 * If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: mat = [[1,2],[3,4]], r = 1, c = 4
 * Output: [[1,2,3,4]]
 */
public class ReshapeMatrix {
    public static void main(String args[]) {
//[[1,2],[3,4]], r = 1, c = 4
        int[][] test = new int[][]{{1, 2}, {3, 4}};
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j] + "      ");
            }
            System.out.println();
        }
        test = matrixReshape(new int[][]{{1, 2}, {3, 4}}, 4, 1);
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j] + "      ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != (mat.length * mat[0].length))
            return mat;
        int[][] result = new int[r][c];


        for (int[] a : result) {
            Arrays.fill(a, 0);
        }
        int r1 = 0, c1 = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                result[r1][c1++] = mat[i][j];
                if (c1 == (c)) {
                    c1 = 0;
                    r1++;
                }
            }

        }

        return result;
    }
}
