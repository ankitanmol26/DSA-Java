class Solution {
    public int romanToInt(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = getValue(s.charAt(i));
//it will check if the current value is less than the next value, if so it will subtract the current value from the answer, otherwise it will add the current value to the answer
            if (i + 1 < s.length() && curr < getValue(s.charAt(i + 1))) {
                ans -= curr;
            } else {
//increment the answer by the current value
                ans += curr;
            }
        }

        return ans;
    }

    public int getValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
}
