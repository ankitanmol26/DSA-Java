// class Solution {
//     public List<List<Integer>> generate(int numRows) {

//         // Pura Pascal triangle store karne ke liye
//         List<List<Integer>> triangle = new ArrayList<>();

//         // Har row ko ek-ek karke banayenge
//         for (int i = 0; i < numRows; i++) {

//             // Current row banate hain
//             List<Integer> row = new ArrayList<>();

//             // Har row ka first element hamesha 1 hota hai
//             row.add(1);

//             // Middle elements calculate karenge
//             // j = 1 se start kyunki index 0 already 1 hai
//             for (int j = 1; j < i; j++) {

//                 // Previous row se upper-left aur upper-right
//                 // elements ko add karna hai
//                 int value = triangle.get(i - 1).get(j - 1)
//                            + triangle.get(i - 1).get(j);

//                 row.add(value);
//             }

//             // Har row ka last element bhi 1 hota hai
//             // First row mein already sirf ek 1 hai,
//             // isliye i > 0 check kar rahe hain
//             if (i > 0) {
//                 row.add(1);
//             }

//             // Current row ko triangle mein add karo
//             triangle.add(row);
//         }

//         // Final Pascal triangle return karo
//         return triangle;
//     }
// }
