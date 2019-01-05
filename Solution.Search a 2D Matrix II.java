public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if( matrix.length == 0 ) return false;
        int j = matrix[0].length-1;
        int i = 0;
    
        while( i <= (matrix.length-1) && j >= 0 )
        {
            if( matrix[i][j] == target )
                return true;

            if( ( (i+1) <= (matrix.length-1) ) && matrix[i+1][j] <= target )
                i++;

            else
                j--;
        }
    
        return false;
    }
}