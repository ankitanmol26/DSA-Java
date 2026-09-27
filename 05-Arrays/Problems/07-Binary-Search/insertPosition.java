
//leetcode problem 35: Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) {

        // Array ke har element ko check karenge
        for (int i = 0; i < nums.length; i++) {

            // Agar target mil gaya, uska index return karo
            if (nums[i] == target) {
                return i;
            }

            // Agar current element target se bada hai,
            // toh target isi index par insert hoga
            if (nums[i] > target) {
                return i;
            }
        }

        // Agar target sabhi elements se bada hai,
        // toh target array ke end mein insert hoga
        // nums.length = last element ke baad wala index
        return nums.length;
    }
}
