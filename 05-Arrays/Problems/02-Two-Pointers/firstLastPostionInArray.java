class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = -1; int last = -1;
        int left = 0; int right = n-1;
        while(left<=right){
            int mid = left + (right - left )/2;
            if(nums[mid] >= target){
                right = mid -1;
            }else{
                left = mid +1;
            } 
        }
        if(left<n && nums[left] == target){
            first = left;
            right = n-1;

            while(left <= right){
                int mid = left + (right - left) / 2;
                if(nums[mid]<= target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
            last = right;
        }
        return new int[]{first, last};
    }
}