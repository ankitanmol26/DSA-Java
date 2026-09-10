
//leetcode 3866. 
class Solution {
    public int firstUniqueEven(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            // Check if number is even
            if (nums[i] % 2 == 0) {

                int count = 0;

                // Count how many times nums[i] appears
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == nums[i]) {
                        count++;
                    }
                }

                // If it appears exactly once
                if (count == 1) {
                    return nums[i];
                }
            }
        }

        return -1;
    }
}
