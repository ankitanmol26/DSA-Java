class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Initializing left to the first element
        int left = 0;

        // Storing the last element
        int right = nums.length - 1;

        // Creating an array to store the answer
        int[] ans = new int[2];

        // The loop runs while left is smaller than right
        while (left < right) {

            // Checking if the sum equals the target
            if (nums[left] + nums[right] == target) {

                // Storing the indices
                ans[0] = left + 1;
                ans[1] = right + 1;

                return ans;
            }

            // If the sum is smaller than target, increment left
            if (nums[left] + nums[right] < target) {
                left++;

            // If the sum is greater than target, decrement right
            } else {
                right--;
            }
        }

        return ans;
    }
}
