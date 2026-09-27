# Array Problems

## Pattern Map

### 01-Hashing
- `containsDuplicates.java`
- `firstUniqueEvent.java`

### 02-Two-Pointers
- `leftRotation.java`
- `mergeSortedArray.java`
- `moveZeroesToEnd`
- `rearrangeArray.java`
- `removeDuplicates.java`
- `removeDuplicates2.java`
- `removeElements.java`

### 05-Kadane-Max-Subarray
- `bestTimetoBuyandSellStock.java`
- `maxiumSubarray.java`

### 06-Sorting
- `sortColors.java`

### 07-Binary-Search
- `arraysToSrting.java`
- `insertPosition.java`

### 11-Subarrays
- `alternatingSubarray.java`
- `countConsecutiveOnes.java`

### 12-Other-Array-Patterns
- `longestCommonPrefix.java`
- `missingNumber.java`
- `missingNumber.class`
- `pascalTriangle2.java`
- `permutation.java`
- `romanToInteger.java`
- `singleNumber.java`
- `singleNumber.class`
- `subset.java`
- `triangle.java`

### 99-Review
- `tempCodeRunnerFile.java`

## Recommended Learning Order

1. **Hashing:** Great starting point for arrays, introduces the fundamental time-space tradeoff.
2. **Two Pointers:** Essential for in-place array modifications and logic-building.
3. **Sorting (Dutch National Flag):** Good for understanding array partitions.
4. **Subarrays:** Pre-requisite for more complex Sliding Window algorithms.
5. **Kadane-Max-Subarray:** Teaches dynamic programming state tracking on arrays (keeping or resetting accumulated values).
6. **Binary Search:** Requires a solid grasp of sorted array behavior.
7. **Other Array Patterns:** Tackle these last, as they involve Math, Bit Manipulation (XOR), and Backtracking which vary greatly in logic.

## Pattern Recognition

### Hashing
- **When to think of it:** When you need to keep track of frequencies, check if an element exists, or find a pair/complement quickly.
- **Main idea:** Use a HashMap or HashSet to trade `O(N)` space for `O(1)` time lookups, avoiding nested loops.
- **Typical Time Complexity:** `O(N)`

### Two Pointers
- **When to think of it:** For in-place modifications (like removing duplicates/zeroes), searching in a sorted array, or reversing segments.
- **Main idea:** Use two indices (e.g., `left` and `right`, or `fast` and `slow`) to traverse the array simultaneously, often avoiding extra space.
- **Typical Time Complexity:** `O(N)`

### Kadane's Algorithm
- **When to think of it:** When looking for a maximum or minimum contiguous subarray sum, or tracking accumulated state (like buying/selling stocks).
- **Main idea:** Keep a running sum. If the sum drops below a useful threshold (like 0 for max sum), reset it and start a new sequence. Track the global max continuously.
- **Typical Time Complexity:** `O(N)`

### Sorting (e.g., Dutch National Flag)
- **When to think of it:** When elements have a limited set of values (e.g., 0, 1, 2) that need grouping, or when pre-sorting simplifies the logic.
- **Main idea:** Use multiple pointers to segregate elements into boundaries or rely on standard sorting routines.
- **Typical Time Complexity:** `O(N)` for counting/DNF, `O(N log N)` for general sorting.

### Binary Search
- **When to think of it:** Whenever the array is sorted and you need to find an element, insertion point, or boundary. Also useful for monotonic functions.
- **Main idea:** Check the middle element and discard half of the search space based on the comparison, narrowing down exponentially fast.
- **Typical Time Complexity:** `O(log N)`

### Subarrays
- **When to think of it:** When dealing with contiguous subsets of the array (e.g., longest alternating, consecutive ones).
- **Main idea:** Expand the sequence while conditions match, and break/reset the sequence or window when the condition fails.
- **Typical Time Complexity:** `O(N)`

### Other Patterns (Math, Bits, Backtracking)
- **When to think of it:** When asked for all combinations/permutations (Backtracking), finding single occurrence anomalies (XOR), or specific geometry/math patterns (Pascal's Triangle).
- **Typical Time Complexity:** `O(N)` for bit manipulation/math, `O(2^N)` or `O(N!)` for backtracking.
