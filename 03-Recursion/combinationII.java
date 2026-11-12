class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, 0, current, result);

        return result;
    }

    public void backtrack(int[] candidates, int remainingTarget,
                          int index, List<Integer> current,
                          List<List<Integer>> result) {

        // Base case: target achieved
        if (remainingTarget == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (remainingTarget < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Skip duplicates at the same recursion level
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Since array is sorted
            if (candidates[i] > remainingTarget) {
                break;
            }

            current.add(candidates[i]);

            // i + 1 because each element can be used only once
            backtrack(candidates, remainingTarget - candidates[i],
                      i + 1, current, result);

            // Backtracking
            current.remove(current.size() - 1);
        }
    }
}