class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        
         if(matrix == null || matrix.length == 0 || matrix[0].length == 0 || target < matrix[0][0] || target > matrix[matrix.length-1][matrix[0].length-1])
            return false;
        
        
        int n = matrix[0].length;
        int m = matrix.length;
        
        if( n == 0 && m == 0)
            return false;
        
        int count = 0;
        
        for(int i = 0; i < n ; i++){
            if( matrix[0][i] > target)
                break;
            
            if(matrix[0][i] == target)
                return true;
            
            count++;
        }
        
        for(int i = 0 ; i < count ; i++){
            for(int j  = 0 ; j < m; j++){
                if(matrix[j][i] == target)
                    return true;
            }
        }
        
        return false;
    }
}