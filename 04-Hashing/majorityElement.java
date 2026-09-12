//leetcode problem 169
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        // HashMap mein number -> uski frequency store karenge
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            // nums[i] kitni baar aaya hai uska count badha rahe hain
            // Agar number pehle nahi hai toh default count 0 lenge
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Check kar rahe hain ki current number majority ban gaya hai ya nahi
            // Majority ka matlab: n/2 se zyada baar aana
            if (map.get(nums[i]) > n / 2) {
                return nums[i];
            }
        }

        // Problem mein majority element guaranteed hai,
        // isliye yahan normally nahi aayega
        return nums[0];
    }
}
