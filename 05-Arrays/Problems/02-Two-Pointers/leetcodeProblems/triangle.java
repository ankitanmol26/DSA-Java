// class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {

//         // Triangle mein total kitni rows hain
//         int n = triangle.size();

//         // Last row ko copy karke result list mein rakh diya
//         List<Integer> result =
//             new ArrayList<>(triangle.get(n - 1));

//         // Bottom se top ki taraf move karenge
//         for (int i = n - 2; i >= 0; i--) {

//             // Current row ke har element par jayenge
//             for (int j = 0; j <= i; j++) {

//                 // Neeche ke dono possible path sums nikalo
//                 int a = result.get(j);
//                 int b = result.get(j + 1);

//                 // Dono mein se chhota path sum choose karo
//                 int min = Math.min(a, b);

//                 // Current number + minimum path sum
//                 // Result list mein purani value update karo
//                 result.set(
//                     j,
//                     triangle.get(i).get(j) + min
//                 );
//             }
//         }

//         // Top par minimum total path sum mil jayega
//         return result.get(0);
//     }
// }