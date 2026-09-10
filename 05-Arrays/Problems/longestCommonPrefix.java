//leetcode 14. Longest Common Prefix
class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Abhi common prefix kuch bhi nahi hai
        String ans = "";

        // i character ka index hai
        // Hum first string ko reference maan rahe hain
        for (int i = 0; i < strs[0].length(); i++) {

            // First string ke current index ka character nikalo
            // Example: i = 0 → 'f'
            //         i = 1 → 'l'
            char ch = strs[0].charAt(i);

            // Har string ko ek-ek karke check karo
            // "for each String str in strs"
            for (String str : strs) {

                // Agar current string chhoti hai
                // YA current character match nahi karta
                // toh common prefix yahin tak hai
                if (i >= str.length() || str.charAt(i) != ch) {
                    return ans;
                }
            }

            // Agar saari strings mein character same tha
            // toh us character ko answer mein add karo
            ans += ch;
        }

        // Agar poori loop complete ho gayi
        // toh jo prefix mila woh return karo
        return ans;
    }
}
