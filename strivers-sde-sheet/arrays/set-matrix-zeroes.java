class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int rowDummy[] = new int[row];
        int colDummy[] = new int[col];

        Arrays.fill(rowDummy, -1);
        Arrays.fill(colDummy, -1);
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(matrix[i][j] == 0)
                {
                    rowDummy[i] = 0;
                    colDummy[j] = 0;
                }
            }
        }
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(rowDummy[i] == 0 || colDummy[j] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}