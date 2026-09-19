// ```java
// class Solution {

//     public int[] rearrangeArray(int[] nums) {

//         // nums ki length n mein store kar rahe hain
//         int n = nums.length;

//         // Answer ke liye n size ka array banaya
//         int[] ans = new int[n];

//         // Positive numbers ko even index par rakhenge
//         // 0, 2, 4, 6...
//         int posInd = 0;

//         // Negative numbers ko odd index par rakhenge
//         // 1, 3, 5, 7...
//         int negInd = 1;

//         // Pura nums array traverse karenge
//         for (int i = 0; i < n; i++) {

//             // Agar current number negative hai
//             if (nums[i] < 0) {

//                 // Negative number ko odd index par daal do
//                 ans[negInd] = nums[i];

//                 // Next negative number ke liye next odd index
//                 negInd += 2;

//             } else {

//                 // Positive number ko even index par daal do
//                 ans[posInd] = nums[i];

//                 // Next positive number ke liye next even index
//                 posInd += 2;
//             }
//         }

//         // Rearranged array return kar do
//         return ans;
//     }
// }
// ```

// ### Simple example

// Agar:

// ```java
// nums = [3, 1, -2, -5, 2, -4]
// ```

// Toh hum positions ko aise fill karenge:

// ```text
// Index:  0   1   2   3   4   5
//         +   -   +   -   +   -
// ```

// Result:

// ```text
// [3, -2, 1, -5, 2, -4]
// ```

// **Main idea:** `posInd` positive numbers ke liye `0, 2, 4...` aur `negInd` negative numbers ke liye `1, 3, 5...` move karta hai.
