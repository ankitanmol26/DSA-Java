//leetcode problem 53
//class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // Current element ko sum mein add karo
            sum += nums[i];

            // Agar current sum ab tak ke max se bada hai,
            // toh max ko update karo
            if (sum > max) {
                max = sum;
            }

            // Agar sum negative ho gaya,
            // toh is subarray ko continue karne ka koi fayda nahi
            // Isliye sum ko 0 se reset kar do
            if (sum < 0) {
                sum = 0;
            }
        }

        // Maximum subarray sum return karo
        return max;
    }
//}
