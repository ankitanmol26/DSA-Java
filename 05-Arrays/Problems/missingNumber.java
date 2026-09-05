
//brute force approach
// public class missingNumber{
//     public static void main(String[] args){
//         int[] arr = {1,2,4,5};
//         int n = arr.length;
//         for(int i=1; i<=n; i++){
//             int flag = 0;
//             for(int j=0; j<n; j++){
//                 if(arr[j]==i){
//                     flag = 1;
//                     break;
//                 }
//             }
//             if(flag==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }
//the time complexity of this approach is O(n^2) and space complexity is O(1)

//now better approach
// public class missingNumber{
//     public static void main(String[] args){
//         int[] arr = {1,2,4,5};
//         int n = arr.length;
//         int[] hash = new int[n+1];
//         for(int i=0; i<=n; i++){
//             hash[i] = 0;
//         }
//         for(int i=0; i<n-1; i++){
//             hash[arr[i]]++;
//         }
//         for(int i=1; i<=n; i++){
//             if(hash[i]==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }
//the time complexity of this approach is O(n) and space complexity is O(n)

//optimal approach this is with the sum approach
// public class missingNumber{
//     public static void main(String[] args){
//         int[] arr = {1,2,4,5};
//         int n = arr.length;
//         int sum = 0;
//         for(int i=0; i<n-1; i++){
//             sum += arr[i];
//         }
//         int totalSum = (n*(n+1))/2;
//         System.out.println(totalSum-sum);
//     }
// }
//the time complexity of this approach is O(n) and space complexity is O(1)

//optimal approach this is with the xor approach
public class missingNumber{
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        int n = arr.length;
        int xor1 = 0;
        for(int i=0; i<n-1; i++){
            xor1 ^= arr[i];
        }
        int xor2 = 0;
        for(int i=1; i<=n; i++){
            xor2 ^= i;
        }
        System.out.println(xor1^xor2);
    }
}
