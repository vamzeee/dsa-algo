class Solution {
    public List<List<Integer>> generate(int numRows) {
        // matrix row - i, matrix column - j
        // for every i, j varies from 0 to i
        // first and last element in every row = 1 (j = 0 and j = i)
        // any other element, mat[i][j] = mat[i-1][j-1] + mat[i-1][j]
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> oldRow = null;
        for(int i = 0; i < numRows; i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++)
            {
                if(j == 0 || j == i)
                    row.add(1);
                else
                {
                    row.add(oldRow.get(j-1) + oldRow.get(j));
                }
            }
            oldRow = row;
            matrix.add(row);
        }
        return matrix;
    }
}