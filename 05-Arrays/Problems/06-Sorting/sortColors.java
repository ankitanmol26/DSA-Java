class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;

        // 0s ko left side mein rakhne ke liye
        int low = 0;

        // Current element ko check karne ke liye
        int mid = 0;

        // 2s ko right side mein rakhne ke liye
        int high = n - 1;

        // Jab tak unknown elements bache hue hain
        while (mid <= high) {

            // Agar current element 0 hai
            if (nums[mid] == 0) {

                // nums[low] aur nums[mid] ko swap karo
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                // Ek 0 apni correct position par aa gaya
                low++;

                // Current element bhi process ho gaya
                mid++;

            // Agar current element 1 hai
            } else if (nums[mid] == 1) {

                // 1 already middle mein correct hai,
                // isliye sirf mid ko aage badhao
                mid++;

            // Agar current element 2 hai
            } else {

                // nums[mid] aur nums[high] ko swap karo
                int tempo = nums[mid];
                nums[mid] = nums[high];
                nums[high] = tempo;

                // Ek 2 apni correct position par aa gaya,
                // isliye high ko left move karo
                high--;

                // Yahan mid++ NAHI karna hai,
                // kyunki high se jo element mid par aaya hai
                // usko abhi check karna baaki hai
            }
        }
    }
}
