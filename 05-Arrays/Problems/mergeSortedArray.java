//leetcode 88 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // i = nums1 ke actual elements ka last index
        int i = m - 1;

        // j = nums2 ke last element ka index
        int j = n - 1;

        // k = nums1 ke last index se start karega
        int k = m + n - 1;

        // Jab tak nums2 ke elements bache hue hain
        while (j >= 0) {

            // Agar nums1 mein element bacha hai
            // aur nums1 ka element bada hai
            if (i >= 0 && nums1[i] > nums2[j]) {

                // Bada element end mein daal do
                nums1[k] = nums1[i];

                // nums1 pointer ko peeche move karo
                i--;

            } else {

                // nums2 ka element bada/equal hai
                // isliye nums2 wala element daal do
                nums1[k] = nums2[j];

                // nums2 pointer ko peeche move karo
                j--;
            }

            // Next empty position par jao
            k--;
        }
    }
}
