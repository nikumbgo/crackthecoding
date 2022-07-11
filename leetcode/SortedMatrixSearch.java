package leetcode;

/**
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.

 */
public class SortedMatrixSearch {

    public static void main(String args[])
    {
        System.out.println(searchMatrix(new int[][]{
                {1,2},{3,4}

        },4));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length == 0 || matrix[0].length ==0)
            return false;

        if(target < matrix[0][0] || target > matrix[matrix.length-1][matrix[0].length-1])
            return false;

        int row=-1;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0] > target)
            {
                row = i-1;
                break;
            }
        }
        if(row == -1)
            row = matrix.length-1;

        int[] c = matrix[row];
        for(int f: c)
        {
            if(f == target)
                return true;
        }

        return false;
    }
}
/**
 *  int n = matrix[0].length;
 *
 *         // binary search
 *         int left = 0, right = m * n - 1;
 *         int pivotIdx, pivotElement;
 *         while (left <= right) {
 *             pivotIdx = (left + right) / 2;
 *             pivotElement = matrix[pivotIdx / n][pivotIdx % n];
 */