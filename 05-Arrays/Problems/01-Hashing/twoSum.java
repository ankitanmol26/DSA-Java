import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Create a HashMap
        // Key   = number from the array
        // Value = index of that number
        HashMap<Integer, Integer> map = new HashMap<>();

        // Go through the array one number at a time
        for (int i = 0; i < nums.length; i++) {

            // We need another number that makes the target
            // Example: target = 9, current number = 2
            // complement = 9 - 2 = 7
            int complement = target - nums[i];

            // Check if we have already seen the complement
            if (map.containsKey(complement)) {

                // map.get(complement) gives us the index
                // of the number we saw earlier
                //
                // i is the index of the current number
                return new int[]{map.get(complement), i};
            }

            // We didn't find the complement yet.
            // So store the current number and its index.
            //
            // Example:
            // nums[i] = 2
            // i = 0
            // map becomes {2 -> 0}
            map.put(nums[i], i);
        }

        // If no pair is found
        return new int[]{};
    }
}
