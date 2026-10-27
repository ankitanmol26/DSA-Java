// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         int n = nums.length;
//         int sum = nums[0] + nums[1] + nums[2];

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {

//                     int add = nums[i] + nums[j] + nums[k];

//                     if (add == target) {
//                         return target;
//                     }

//                     if (Math.abs(add - target) <
//                         Math.abs(sum - target)) {
//                         sum = add;
//                     }
//                 }
//             }
//         }

//         return sum;
//     }
// }
//this is brute force which is not optimal solution. we can use two pointer approach to solve this problem in O(n^2) time complexity.
//tc is o(ncube) and sc is o(1).
//but we can use two pointer approach to solve this problem in O(n^2) time complexity.

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = nums[0]+nums[1]+nums[2];

        for(int i =0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int add = nums[i]+nums[left]+nums[right];

                if(Math.abs(add - target)< Math.abs(sum-target)){
                    sum = add;
                }
                if(add == target){
                    return target;
                }else if (add<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return sum;
    }
}
//this using two pointer approach to solve this problem in O(n^2) time complexity and O(1) space complexity.