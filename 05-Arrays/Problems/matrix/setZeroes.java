
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        // Step 1: Check if the first row contains any zero
        boolean firstRowZero = false;
        for(int j=0; j<n; j++){
            if(matrix[0][j]==0){
                firstRowZero = true;
                break;
            }
        }
        // Step 2: Check if the first column contains any zero
        boolean firstColZero = false;
        for(int i=0; i<m; i++){
            if(matrix[i][0]==0){
                firstColZero = true;
                break;
            }
        }
        // Step 3: Use the first row and column as markers
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // Step 4: Set inner cells to zero using markers
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][0]==0 || matrix[0][j] ==0){
                    matrix[i][j] = 0;
                }
            }
        }
        // Step 5: Zero the first row if required
        if(firstRowZero){
            for(int j=0; j<n; j++){
                matrix[0][j]=0;
            }
        }
        // Step 6: Zero the first column if required
        if(firstColZero){
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }

    }
}