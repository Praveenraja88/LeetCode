class Solution {
    public boolean searchMatrix(int[][] mat, int target) {

        int m = mat.length;
        int n = mat[0].length;

        int row = 0 , col = n - 1; 

        while(row<m && col>=0)
        {
            int val = mat[row][col];

            if(val==target) return true;

            else if(val<target)
            {
                row++;
            }
            else
            {
                col--;
            }
        }

        return false;
        
    }
}