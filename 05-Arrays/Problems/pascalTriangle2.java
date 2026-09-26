//leetcode problem 119
class Solution {
    public List<Integer> getRow(int rowIndex) {

        // Starting mein har row ka first element 1 hota hai
        List<Integer> row = new ArrayList<>();
        row.add(1);

        // 1 se rowIndex tak row banayenge
        for (int i = 1; i <= rowIndex; i++) {

            // Right se left update karna hai
            // Kyunki humein purani values calculation ke liye chahiye
            for (int j = i - 1; j > 0; j--) {

                // Current value = upar wali left value + upar wali right value
                row.set(j, row.get(j) + row.get(j - 1));
            }

            // Har row ka last element bhi 1 hota hai
            row.add(1);
        }

        // Jo rowIndex diya tha, woh row return kar do
        return row;
    }
}

