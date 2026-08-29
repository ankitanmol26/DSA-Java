//leetcode problem 414
class Solution {
    public int thirdMax(int[] nums) {

        long largest = Long.MIN_VALUE;
        long sLargest = Long.MIN_VALUE;
        long tLargest = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == largest || nums[i] == sLargest || nums[i] == tLargest) {
                continue;
            }

            if (nums[i] > largest) {
                tLargest = sLargest;
                sLargest = largest;
                largest = nums[i];

            } else if (nums[i] > sLargest) {
                tLargest = sLargest;
                sLargest = nums[i];

            } else if (nums[i] > tLargest) {
                tLargest = nums[i];
            }
        }

        if (tLargest == Long.MIN_VALUE) {
            return (int) largest;
        }

        return (int) tLargest;
    }
}
