class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        System.out.println(n + " "+m);
        for(int i=0; i<n; i++){
            if(matrix[i][m-1] == target)
                return true;
            
            else if(target < matrix[i][m-1]){
                    for(int j=0; j<m; j++){
                        if(matrix[i][j] == target)
                            return true;
                    }
                return false;
            }
        }
        
        return false;
    }
}