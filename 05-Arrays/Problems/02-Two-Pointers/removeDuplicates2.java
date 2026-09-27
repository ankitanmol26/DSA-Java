//leetcode 80 removeduplicates in sorted array 2
class Solution {
    public int removeDuplicates(int[] nums) {
        
        // write batayega ki next valid element kaha likhna hai
        int write = 0;

        // i poore array ko left se right read karega
        for (int i = 0; i < nums.length; i++) {

            // Pehle 2 elements ko hamesha allow karna hai
            if (write < 2) {

                // Current element ko write position par copy karo
                nums[write] = nums[i];
                write++;

            } 
            // Agar current element, 2 positions pehle wale
            // element ke same nahi hai, toh isse rakh sakte hain
            else if (nums[i] != nums[write - 2]) {

                // Valid element ko write position par daalo
                nums[write] = nums[i];
                write++;
            }

            // Agar same hai, iska matlab ye third duplicate hai
            // Isliye kuch nahi karna, element ko skip kar do
        }

        // write = total valid elements (k)
        return write;
    }
}
