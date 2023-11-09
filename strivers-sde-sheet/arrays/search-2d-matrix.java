class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        // First, we find what row the number could be in, by iterating through the
        // first
        // element of every row.
        // We can do this because we know that the matrix is arranged in a
        // non-decreasing order.
        int row = 0;
        for (int i = 0; i < m - 1; i++) {
            if (target >= matrix[i][0] && target < matrix[i + 1][0])
                break;
            else
                row++;
        }

        // now that we know the row, we just iterate through it and find the number
        for (int i = 0; i < n; i++) {
            if (target == matrix[row][i])
                return true;
        }
        return false;
    }
}