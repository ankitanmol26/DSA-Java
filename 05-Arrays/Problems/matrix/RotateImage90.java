// class Solution {
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;
//         for(int i =0; i<n-1; i++){
//             for(int j=i+1; j<n; j++){
//                 //swaping the elements
//                 //traspose the matrix
//                 int temp = matrix[i][j];
//                 matrix[i][j]=matrix[j][i];
//                 matrix[j][i]=temp;
//             }
//         }
//         for(int i =0; i<n; i++){
//             //reverse the matrix
//             int left = 0;
//             int right = n-1;
//             while(left<right){
//                 int temp = matrix[i][left];
//                 matrix[i][left]=matrix[i][right];
//                 matrix[i][right]=temp;
//                 left++;
//                 right--;
//             }
//         }
//     }
// }

// first we have to transpose the matrix and then we have to reverse the matrix.
