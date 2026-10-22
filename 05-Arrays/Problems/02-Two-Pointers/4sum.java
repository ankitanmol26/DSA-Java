import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // Sort the array to use the two-pointer approach
        Arrays.sort(nums);

        // Fix the first element
        for (int i = 0; i < n - 3; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Fix the second element
            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicate second elements
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Initialize two pointers
                int left = j + 1;
                int right = n - 1;

                // Find the remaining two elements
                while (left < right) {

                    // Use long to prevent integer overflow
                    long sum = (long) nums[i] + nums[j]
                             + nums[left] + nums[right];

                    if (sum == target) {

                        // Found a valid quadruplet
                        result.add(Arrays.asList(
                            nums[i], nums[j], nums[left], nums[right]
                        ));

                        // Move both pointers
                        left++;
                        right--;

                        // Skip duplicate left elements
                        while (left < right &&
                               nums[left] == nums[left - 1]) {
                            left++;
                        }

                        // Skip duplicate right elements
                        while (left < right &&
                               nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (sum < target) {

                        // Sum is too small, increase it
                        left++;

                    } else {

                        // Sum is too large, decrease it
                        right--;
                    }
                }
            }
        }

        // Return all unique quadruplets
        return result;
    }
}