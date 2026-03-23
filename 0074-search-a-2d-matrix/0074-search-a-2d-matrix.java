class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        
        int m = mat.length;
        int n = mat[0].length;
        int left = 0 , right = m*n-1;

        while(left<=right)
        {
            int mid = left + (right -left) / 2 ;

            int val = mat[mid/n][mid%n];

            if(val==target) return true;

            else if( val<target) left = mid + 1 ; 

            else right = mid - 1 ;
        }

        return false ;
    }
}