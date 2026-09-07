class Solution {
    public int alternatingSubarray(int[] nums) {

        // Current alternating subarray ki length
        int current = 1;

        // Abhi tak ka longest valid alternating subarray
        int answer = -1;

        // Agla difference kya hona chahiye?
        // Alternating subarray hamesha +1 se start hota hai.
        int expected = 1;

        // Previous element ke saath current element ko compare karenge
        for (int i = 1; i < nums.length; i++) {

            // Current aur previous element ka difference
            int diff = nums[i] - nums[i - 1];

            // Kya hume expected difference mila?
            if (diff == expected) {

                // Haan, sequence continue ho rahi hai
                current++;

                // Next difference opposite hona chahiye
                // +1 -> -1
                // -1 -> +1
                expected *= -1;

            } else {

                // Current sequence toot gayi.
                // Kya isi pair se new sequence start ho sakti hai?
                if (diff == 1) {

                    // [nums[i-1], nums[i]] ek valid pair hai
                    current = 2;

                    // +1 ke baad -1 expected hai
                    expected = -1;

                } else {

                    // Kuch valid nahi mila,
                    // sequence reset kar do.
                    current = 1;

                    // New sequence hamesha +1 se start hogi
                    expected = 1;
                }
            }

            // IMPORTANT:
            // Length 1 alternating subarray nahi hai.
            // Isliye answer tabhi update karo jab current >= 2 ho.
            if (current >= 2) {
                answer = Math.max(answer, current);
            }
        }

        return answer;
    }
}
