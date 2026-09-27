//brute force approach
// public class singleNumber{
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4,5,1,2,3,4};
//         int n = arr.length;
//         int count = 0;
//         for(int i=0; i<n; i++){
//             count = 0;
//             for(int j=0; j<n; j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                 }
//             }
//             if(count == 1){
//                 System.out.println(arr[i]);
//                 break;
//             }
//         }
//     } 
// }
//the time complexity of this approach is O(n^2) and space complexity is O(1)

//better approach
// public class singleNumber{
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4,5,1,2,3,4};
//         int n = arr.length;
//         int[] hash = new int[100];
//         for(int i=0; i<n; i++){
//             hash[arr[i]]++;
//         }
//         for(int i=0; i<100; i++){
//             if(hash[i] == 1){
//                 System.out.println(i);
//                 break;
//             }
//         }
//     } 
// }
//the time complexity of this approach is O(n) and space complexity is O(1)

//optimal approach
public class singleNumber{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,1,2,3,4};
        int n = arr.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            ans ^= arr[i];
        }
        System.out.println(ans);
    } 
}
//the time complexity of this approach is O(n) and space complexity is O(1)