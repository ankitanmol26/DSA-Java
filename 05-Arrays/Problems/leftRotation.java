public class leftRotation{
    public static void main(String[] args) {
        
    }
}
//striver problem
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n =nums.length;
//         int temp=nums[0];
//         for(int i=1;i<n; i++){
//             nums[i-1]=nums[i];

//         }
//         nums[n-1]=temp;
//         return nums;
//     }
// }

//for the leetcode problem 189
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n =nums.length;
//         k = k % n;
//         for(int j=0; j<k; j++){
//         int temp=nums[n-1];
//         for(int i=n-2;i>=0; i--){
//             nums[i+1]=nums[i];

//         }
        
//         nums[0]=temp;
        
//         }
       
//     }
// } this problem can be solved in O(n) time complexity and O(1) space complexity by using the reverse method. The idea is to reverse the entire array, then reverse the first k elements, and finally reverse the remaining n-k elements. Here's how you can implement it:

