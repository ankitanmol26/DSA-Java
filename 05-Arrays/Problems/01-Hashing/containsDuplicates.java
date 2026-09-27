// public class containsDuplicates{
//     public static void main(String[] args) {
        
//     }
// }

//leetcode problem 219
//the algo in the plain text is as follows:
// Create an empty HashMap

// Go through nums from left to right:

//     Get the current number

//     If the number is already in the HashMap:
        
//         Get its previous index
        
//         Calculate current index - previous index
        
//         If that distance <= k:
//             return true

//     Store/update:
//         current number → current index

// After checking everything:
//     return false


//========================================

import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        // HashMap stores:
        // number -> most recent index where we saw that number
        HashMap<Integer, Integer> map = new HashMap<>();

        // Go through every element in the array
        for (int i = 0; i < nums.length; i++) {

            // Check if we have already seen this number
            if (map.containsKey(nums[i])) {

                // Get the previous index of this number
                int previousIndex = map.get(nums[i]);

                // Check if the distance between the two indexes is <= k
                if (i - previousIndex <= k) {
                    return true;
                }
            }

            // Store/update the number with its current index
            // Example: if 1 was at index 0 and now is at index 2,
            // the map changes from 1 -> 0 to 1 -> 2
            map.put(nums[i], i);
        }

        // If we checked the whole array and didn't find
        // a duplicate within distance k
        return false;
    }
}

